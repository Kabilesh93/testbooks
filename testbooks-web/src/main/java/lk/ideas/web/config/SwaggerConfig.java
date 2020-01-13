package lk.ideas.web.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
    /**
     * Docket bean is picked up by the swagger-mvc framework - allowing for
     * swagger API controller
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


    /**
     * Customize swagger API information
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Float REST APIs")
                .description("The APIs here demonstrate creating a 'production-ready' service built with Spring Boot and other helpful libraries")
                .version("1.0")
                .build();

    }
}
