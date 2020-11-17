package com.consumingREST.consumeREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ConsumeRestApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumeRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumeRestApplication.class, args);
    }



    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {

            TopStories results = restTemplate.getForObject(
                    "https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=d3CVSSwy1PCBgLzjqVnVm4MOPRcGaHP4", TopStories.class);
            log.info(results.toString());

        };
    }

}
