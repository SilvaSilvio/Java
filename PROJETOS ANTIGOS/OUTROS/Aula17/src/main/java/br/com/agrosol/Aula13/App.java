package br.com.agrosol.Aula13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = { "model" })
@ComponentScan(basePackages = { "control" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
