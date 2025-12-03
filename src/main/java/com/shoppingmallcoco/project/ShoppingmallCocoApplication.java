package com.shoppingmallcoco.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = "com.shoppingmallcoco.project")
public class ShoppingmallCocoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShoppingmallCocoApplication.class);
    }

    public static void main(String[] args) {
        try {
            SpringApplication.run(ShoppingmallCocoApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
