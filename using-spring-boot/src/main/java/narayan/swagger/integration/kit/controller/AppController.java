package narayan.swagger.integration.kit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author narayan-sambireddy
 *
 */
@RestController
public class AppController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
