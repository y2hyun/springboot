package net.yang.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("net.yang.core.entity")
@EnableJpaRepositories("net.yang.core.repository")
public class ExampleCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleCoreApplication.class, args);
	}
}
