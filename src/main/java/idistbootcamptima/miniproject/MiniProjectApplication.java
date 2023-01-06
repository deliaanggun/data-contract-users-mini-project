package idistbootcamptima.miniproject;

import idistbootcamptima.miniproject.model.dao.User;
import idistbootcamptima.miniproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MiniProjectApplication {

	//you can add the user data in this class
	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveUser(new User(1L,
					"8791287317263",
					"Bank Central Asia",
					"0987654321",
					"Joko Susanto",
					"+628577777888",
					LocalDate.of(1990,Month.JANUARY, 7),
					"joko@mail.com",
					"mizumo12",
					"1111",
					"123456",
					"30000000"
					));
			userService.saveUser(new User(2L,
					"6789012345678",
					"Bank Rakyat Indonesia",
					"1234567890",
					"Sora Ibrahim",
					"+62858888877",
					LocalDate.of(1995,Month.DECEMBER, 10),
					"sora@mail.com",
					"sora55",
					"2222",
					"654321",
					"100000000"
			));
		};
	}

//	@Bean
//	public PasswordEncoder passwordEncoder(){
//		return NoOpPasswordEncoder.getInstance();
//	}
}

