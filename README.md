## What you'll need
JDK 8 +

## Build the app
```
sh gradlew build
```

## Run the app
```
java -jar build/lib/*.war
```

## Generate eclipse settings
```
sh gradlew eclipse
```

## Generate intellij settings
```
sh gradlew idea
```

## Sample Controller
```java
@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/rest/customers/{sn}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("sn") String sn) {
		return customerService.getCustomer(sn);
	}
	
}
```

## Add your own handler for a request uri 
```java
	@RequestMapping(value="/rest/customers/{sn}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("sn") String sn) {
		return customerService.getCustomer(sn);
	}
```
