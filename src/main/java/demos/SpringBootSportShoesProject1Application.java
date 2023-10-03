package demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan(basePackages = {"com.controller", "com.entity", "com.dao", "com.service"})
@EnableJpaRepositories
public class SpringBootSportShoesProject1Application {

	public static void main(String[] args)  {
	
		SpringApplication.run(SpringBootSportShoesProject1Application.class, args);
	
	
	
	}
}

