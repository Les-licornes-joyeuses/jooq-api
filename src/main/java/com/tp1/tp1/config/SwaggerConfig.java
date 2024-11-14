//package com.tp1.tp1.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
//
//import java.util.Collections;
//
//@Configuration
//@EnableSwagger2
//@EnableWebMvc
//public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(PathSelectors.ant("/api/**"))
//                .apis(RequestHandlerSelectors.basePackage("com.springtutorial"))
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "My REST API", //title
//                "Some custom description of API.", //description
//                "Version 1.0", //version
//                "Terms of service", //terms of service URL
//                new Contact("API Support", "API support URL", "API support email"),
//                "License of API", "API license URL", Collections.emptyList()); // contact info
//    }
//}

