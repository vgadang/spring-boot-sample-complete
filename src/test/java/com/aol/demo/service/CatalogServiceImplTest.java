package com.aol.demo.service;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.anything;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:responses-context.xml"})
public class CatalogServiceImplTest {

	@Autowired
	private Properties responses;
	
	private CatalogService catalogService;
	private MockRestServiceServer mockServer;

	@Before
	public void setUp() throws Exception {
		catalogService = new CatalogServiceImpl();
		
		// Create stubbing mock rest service
		RestTemplate restTemplate = new RestTemplate();
		ReflectionTestUtils.setField(catalogService, "restOperations", restTemplate);
		mockServer = MockRestServiceServer.createServer(restTemplate);
		
		// Inject the mocking rest service
		ReflectionTestUtils.setField(catalogService, "ecommerceEndpoint", "https://ecom.aol.com");
	}

	@Test
	public void testGetProduct() {
		// Set stubbing expectations
    	mockServer.expect(anything()).andRespond(withSuccess(responses.getProperty("catalog.product.response"), MediaType.APPLICATION_JSON));
    	
    	// Test it
		final com.aol.demo.model.Product product = catalogService.getProduct("redbox-dvd-rental");
		assertNotNull(product);
		
		// Verify
		mockServer.verify();
	}

}
