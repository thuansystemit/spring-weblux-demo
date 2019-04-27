package com.pvthuan.gateways.configure;

import com.pvthuan.gateways.utils.Constant;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(Constant.API +"/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("POST, PUT,  GET, OPTIONS, DELETE")
                .allowCredentials(true).maxAge(3600)
                .allowedHeaders("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
    }
}
