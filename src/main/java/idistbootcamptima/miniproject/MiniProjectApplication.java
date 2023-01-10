package idistbootcamptima.miniproject;

import idistbootcamptima.miniproject.model.dao.Transaction;
import idistbootcamptima.miniproject.model.dao.User;
import idistbootcamptima.miniproject.service.TransactionService;
import idistbootcamptima.miniproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

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
					"8791287317263", "Bank Central Asia", "0987654321", "Joko Susanto", "+628577777888",
					LocalDate.of(1990,Month.JANUARY, 7),
					"joko@mail.com", "mizumo12", "1111", "123456", 30000000L));
			userService.saveUser(new User(2L,
					"6789012345678", "Bank Rakyat Indonesia", "1234567890", "Sora Ibrahim", "+62858888877",
					LocalDate.of(1995,Month.DECEMBER, 10),
					"sora@mail.com", "sora55", "2222", "654321", 100000000L));
			userService.saveUser(new User(3L,
					"8901236458908", "Mandiri", "4567890123", "Keisha Halimah", "+62889090909",
					LocalDate.of(1997,Month.FEBRUARY, 28),
					"keisha@mail.com", "keisha", "3333", "343434", 2000000L));
			userService.saveUser(new User(4L,
					"3571235786547", "Bank Evil Corps", "2345890168", "Handoko Kusuma", "+62823456789",
					LocalDate.of(1999,Month.JUNE, 16),
					"kusuma@mail.com", "kusuma23", "4444", "767676", 90000000L));
			userService.saveUser(new User(5L,
					"6789012345678", "Bank Rakyat Indonesia", "1234567890", "Rizki Saputra", "+62854325432",
					LocalDate.of(1991,Month.JULY, 18),
					"putra@mail.com", "saputra", "5555", "654321", 180000000L));
			userService.saveUser(new User(6L,
					"9417385326196", "Bank Rakyat Indonesia", "1234567890", "Maulana Ibrahim", "+62846464646",
					LocalDate.of(1998,Month.MARCH, 11),
					"ibrahim@mail.com", "ibrahim9", "6666", "654864", 890000000L));
			userService.saveUser(new User(7L,
					"7763285358765", "Bank Rakyat Indonesia", "1234567890", "Reyhandi", "+62889562347",
					LocalDate.of(1994,Month.NOVEMBER, 22),
					"rey@mail.com", "reyhan", "7777", "327649", 123400000L));
			userService.saveUser(new User(8L,
					"4853276543975", "Bank Rakyat Indonesia", "1234567890", "Eko Lesmono", "+62868572536",
					LocalDate.of(1993,Month.OCTOBER, 30),
					"eko@mail.com", "eko23", "8888", "384216", 9000000L));
			userService.saveUser(new User(9L,
					"4863274653865", "Bank Rakyat Indonesia", "1234567890", "Rangga Hardiansyah", "+62806835842",
					LocalDate.of(1995,Month.MAY, 26),
					"rangga@mail.com", "rangga", "9999", "103856", 89700000L));
			userService.saveUser(new User(10L,
					"8725316549537", "Bank Rakyat Indonesia", "1234567890", "Shanilda Sabilla", "+62894264873",
					LocalDate.of(1989,Month.SEPTEMBER, 17),
					"shani@mail.com", "shanilda", "1010", "364758", 1000009876L));
			userService.saveUser(new User(11L,
					"1175385329705", "Bank Rakyat Indonesia", "1234567890", "Anindiya Putri", "+62817302738",
					LocalDate.of(1990,Month.AUGUST, 25),
					"nindiya@mail.com", "aninputri", "1011", "743852", 5600000L));
			userService.saveUser(new User(12L,
					"8547533664375", "Bank Rakyat Indonesia", "1234567890", "Shakilla Dean", "+62865329439",
					LocalDate.of(1997,Month.APRIL, 15),
					"killa@mail.com", "shakilla", "1212", "384625", 54600000L));
		};
	}

	@Bean
	CommandLineRunner run2(TransactionService transactionService){
		return args -> {

			transactionService.saveTransaction(new Transaction( 1L,
					"Keisha Halimah - 12548963", "Handoko Kusuma - 78945612", "Rp.90000", "Pembelian",
					LocalDate.of(2022, Month.SEPTEMBER, 10),
					"Income", "ECZ-6998745"));
			transactionService.saveTransaction(new Transaction( 2L,
					"Restu Anindya - 38271649", "Handoko Kusuma - 78945612", "Rp.100000", "Pembayaran",
					LocalDate.of(2022, Month.JANUARY, 28),
					"Outcome", "ECZ-5789512"));
			transactionService.saveTransaction(new Transaction( 3L,
					"Maulana Ibrahim - 78364512", "Sari Siska Halimah - 87346219", "Rp.1000000", "Nice Day",
					LocalDate.of(2022, Calendar.SEPTEMBER, 19),
					"Income", "ECZ-1823947"));
			transactionService.saveTransaction(new Transaction( 4L,
					"Rangga Hardiansyah - 65465765", "Eko Lesmana - 92349864", "Rp.50000", "Have a good day",
					LocalDate.of(2022, Calendar.FEBRUARY, 20),
					"Income", "ECZ-0675486"));
			transactionService.saveTransaction(new Transaction( 5L,
					"Anggraini Dani - 85643765", "Paiman Januar - 92219304", "Rp.500000", "Hadiah",
					LocalDate.of(2022, Calendar.MAY, 15),
					"Income", "ECZ-2839416"));
			transactionService.saveTransaction(new Transaction( 6L,
					"Tirta Buana Lie - 46321345", "Pandi Akbar - 36458463", "Rp.200000", "Buat beli jajan",
					LocalDate.of(2022, Calendar.MARCH, 19),
					"Income", "ECZ-8263749"));
			transactionService.saveTransaction(new Transaction( 7L,
					"Mudi Setya - 37879876", "Joko Susanto - 39841532", "Rp.1900000", "Pembelian",
					LocalDate.of(2022, Calendar.SEPTEMBER, 21),
					"Outcome", "ECZ-1829374"));
			transactionService.saveTransaction(new Transaction( 8L,
					"Mudy Setya - 37879876", "Subradun - 04956325", "Rp.1500000", "Bayar Kos",
					LocalDate.of(2022, Calendar.OCTOBER, 18),
					"Outcome", "ECZ-9687253"));
			transactionService.saveTransaction(new Transaction( 9L,
					"Reyhandi Akbar - 39847980", "Handoko Kusuma - 78945612", "Rp.40000", "Pembayaran",
					LocalDate.of(2022, Calendar.DECEMBER, 23),
					"Income", "ECZ-2934586"));
			transactionService.saveTransaction(new Transaction( 10L,
					"Dean Saputri - 29523421", "Akbar Priadi - 29656754", "Rp.80000", "Beli Barang",
					LocalDate.of(2022, Calendar.DECEMBER, 16),
					"Outcome", "ECZ-1892239"));
			transactionService.saveTransaction(new Transaction( 11L,
					"Maulana Ibrahim - 78364512", "Shakila Nabila - 02391542", "Rp.75000", "Pembelian",
					LocalDate.of(2022, Calendar.NOVEMBER, 30),
					"Outcome", "ECZ-6345975"));
			transactionService.saveTransaction(new Transaction( 12L,
					"Sorai Putri - 284785676", "Handoko Kusuma - 78945612", "Rp.150000", "Pembelian",
					LocalDate.of(2022, Calendar.AUGUST, 17),
					"Outcome", "ECZ-2900376"));
		};
	}

//	@Bean
//	public PasswordEncoder passwordEncoder(){
//		return NoOpPasswordEncoder.getInstance();
//	}
}

