package DIO.aula_spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "DIO.Repository")/*localização para  container localizar a classe*/
@Component(value = "StartApp")

public class AulaSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}

}
