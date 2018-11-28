package CartolaFC.interfacegrafica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"CartolaFC.*"})
public class CartolaFCApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartolaFCApplication.class, args);
	}
}
