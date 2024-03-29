package com.org.employee.doc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact("INOVA", "http://inovaitsys.com", "inova@inovaitsys.com");
	public static final ApiInfo DEFAULT = new ApiInfo("Api Documentation of Employee Details Application",
			"Api Documentation of Employee Details Application", "1.0.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0",
			"http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
	private static final Set<String> DEFAULT_CON_PROD = new HashSet<>(
			Arrays.asList("application/json", "application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(springfox.documentation.builders.PathSelectors.regex("/api.*")).build().apiInfo(DEFAULT)
				.produces(DEFAULT_CON_PROD).consumes(DEFAULT_CON_PROD);
	}
}
