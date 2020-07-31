package com.vvv.kodilan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.*"})
public class KodilanJavaBeCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodilanJavaBeCloneApplication.class, args);
	}

}
