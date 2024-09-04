package lv.nixx.poc.webflux;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class WebfluxSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxSandboxApplication.class, args);
	}

}
