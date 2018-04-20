package narayan.swagger.integration.kit.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import narayan.swagger.integration.kit.domain.Alpha;

/**
 * 
 * @author narayan-sambireddy
 *
 */
@RestController
public class AlphaController {

	@PostMapping( 
			value = "/fetchAlpha",
			produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE }, 
			consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public Alpha updateAlpha(@RequestBody Alpha alpha) {
		return new Alpha();
	}
}
