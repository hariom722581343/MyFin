package config;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("MyFin Bank API")
                .description("API for MyFin Bank")
                .version("1.0")
                .termsOfServiceUrl("(link unavailable)")
                .license("Apache License, Version 2.0")
                .licenseUrl("(link unavailable)")
                .build();
    }
}
