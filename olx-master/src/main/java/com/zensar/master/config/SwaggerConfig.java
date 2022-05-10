package com.zensar.master.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket getCustomizedDocket() {
	return new Docket(DocumentationType.SWAGGER_2)
	.select()
	.apis(RequestHandlerSelectors.basePackage("com.zensar"))
	.build()
	.apiInfo(getApiInfo());
	}
	
private ApiInfo getApiInfo() {	
	
return new ApiInfo("Stock","this application mange","1.0.0","http://www.zensar.com","shravya","Apache","www.apache.org/license");
}

}
