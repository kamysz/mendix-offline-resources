package com.exampl.staticresources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StaticResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaticResourcesApplication.class, args);
    }

    @RestController
    public class HelloController {

        @RequestMapping("/")
        public String index() {
            return "<a href='/runtime/mendix-8.12.1.3458.tar.gz'>Mendix 8.12.1.3458 Runtime</a>" +
                    "<br>" +
                    "<a href='/mx-buildpack/AdoptOpenJDK-jdk-11.0.3-linux-x64.tar.gz'>AdoptOpenJDK 11.0.3</a>";
        }

    }
}
