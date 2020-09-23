package ru.scli.lawyersmigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class LawyersMigrationApplication {

	public static void main(String[] args) {
		Long t1 = new Date().getTime();
		SpringApplication.run(LawyersMigrationApplication.class, args);
		Long t2 = new Date().getTime();
		Long t3 = t2 - t1;
		System.out.println("Прошло времени " + t3);


	}

}
