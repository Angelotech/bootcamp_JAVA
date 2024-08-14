package DIO.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import DIO.Repository.UserRepository;
import Model.User;

@Component
public class StartApp implements CommandLineRunner {	
	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();		
		user.setName("angelo");
		user.setUsername("angelo42");
		user.setPassaword("1998");	
		repository.save(user);
		
		for (User l : repository.findAll()) {
			System.out.println(l+"ola");
			
			
		}
		System.out.print("ola mundo");
		
		
		
	}

}
