package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepostitory;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    
	@Autowired
	private UserRepostitory userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("mathi", "deepiga", "mathi@gmail.com"));		
		this.userRepository.save(new User("maha", "deep", "mathideeps@gmail.com"));	
		this.userRepository.save(new User("mathideepi", "deepa", "deepimathi@gmail.com"));	

	}

}
