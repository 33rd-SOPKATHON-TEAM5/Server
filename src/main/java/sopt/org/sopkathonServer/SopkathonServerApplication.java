package sopt.org.sopkathonServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SopkathonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SopkathonServerApplication.class, args);
	}

}
