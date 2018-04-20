package narayan.swagger.integration.kit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author narayan-sambireddy
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerContext {

	@Bean
	public Docket swaggerApi(SwaggerProperties swaggerProps) {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo(swaggerProps))
				.select()
					.apis((RequestHandlerSelectors.basePackage(swaggerProps.getBasePackages())))
				.build();
				
	}

	private ApiInfo apiInfo(SwaggerProperties swaggerProps) {
		return new ApiInfoBuilder()
				.title(swaggerProps.getTitle())
				.description(swaggerProps.getDescription()).contact(contact(swaggerProps)).build();
	}

	private Contact contact(SwaggerProperties swaggerProps) {
		return new Contact(swaggerProps.getContactName(), swaggerProps.getContactUrl(), swaggerProps.getContactEmail());
	}
	
}
