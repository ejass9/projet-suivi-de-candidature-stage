package dev.ejassab.suivi_candidature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class SuiviCandidatureApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SuiviCandidatureApplication.class, args);
		RestTemplate restTemplate =(RestTemplate) context.getBean("restTemplate");
		System.out.println(restTemplate);
	}

}
