package upskills.sqlcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import upskills.sqlcon.model.User;
import upskills.sqlcon.service.UserService;

@SpringBootApplication
//@ComponentScan("upskills.sqlcon")
//@PropertySource("file:./application.properties")
public class ReconciliationSpringBootApplication implements ApplicationRunner {
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ReconciliationSpringBootApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {	
		
		System.out.println("Begin testing phase...");
		
		User user = userService.getUserByName("LLE");
		
		System.out.println(user.getName());
		
	}
}
