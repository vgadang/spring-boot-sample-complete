package com.aol.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aol.demo.model.Preferences;
import com.aol.demo.service.PreferencesService;

@RestController
@RequestMapping("/rest/preferences")
public class PreferencesRestController {
	
	@Autowired
	private PreferencesService preferencesService;

	@RequestMapping(value="/{sn}", method=RequestMethod.GET)
	public Preferences getCustomer(@PathVariable("sn") String sn) {
		return preferencesService.getPreference(sn);
	}

	@RequestMapping(method=RequestMethod.POST)
	public Preferences createCustomer(@RequestBody Preferences preferences) {
		return preferencesService.createPreference(preferences);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Preferences> getCustomers(@RequestParam("color") String color) {
		return preferencesService.getPreferencesByColer(color);
	}

}
