package com.deppit.feature.toggle.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.deppit.feature.toggle.server.repository")
public class FeatureToggleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureToggleServerApplication.class, args);
	}

}

