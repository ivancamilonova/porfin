package com.ejercicio.ejerciciotallerfinal.web.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public Docket Api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ejercicio.ejerciciotallerfinal.web.controller"))
                .build()
                .apiInfo(getapiinfo());
    }
    private ApiInfo getapiinfo(){
        return new ApiInfo(
                "API REST armada",
                "API REST atencion al ciudadano",
                "1.0.0",
                "",
                new Contact("Atencion al Ciudadano", "https://Admin@cfjcs.net", "centrodefusion.jina@armada.mil.co"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
