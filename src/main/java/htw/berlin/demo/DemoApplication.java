package htw.berlin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static String greetings(){
		return("Hello world!");
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
