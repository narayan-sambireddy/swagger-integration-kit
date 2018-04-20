package narayan.swagger.integration.kit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Optional Controller to redirect to swagger view page from context-root.
 * 
 * @author narayan-sambireddy
 *
 */
@Controller
public class SwaggerViewController {

	@GetMapping
	public String showView() {
		return "redirect:swagger-ui.html";
	}

}
