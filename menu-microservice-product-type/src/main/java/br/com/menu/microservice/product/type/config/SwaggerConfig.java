package br.com.menu.microservice.product.type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket greetingApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("br.com.menu.microservice.product.type.controller"))
            .build()
            .apiInfo(apiInfo());

  }

  public ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("Documentação dos microservices")
            .description("Documentação para auxiliar desenvolvedores que desejam utilizar/desenvolver microservices.")
            .build();
  }

}
