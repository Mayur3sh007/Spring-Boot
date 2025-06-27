package com.spring_core.Spring_Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Since Component scanner only scans within our core package i.e "Spring_Core" and since the "utils" are outside it in another package we need to def what packages need to be scanned when the app starts
@SpringBootApplication(
		scanBasePackages = {
				"com.spring_core.Spring_Core",
				"com.spring_core.utils"
		}
)
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
