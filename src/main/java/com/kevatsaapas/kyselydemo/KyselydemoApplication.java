package com.kevatsaapas.kyselydemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kevatsaapas.kyselydemo.domain.Kysymys;
import com.kevatsaapas.kyselydemo.domain.KysymysRepository;


@SpringBootApplication
public class KyselydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyselydemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner kyselyDemo(KysymysRepository repository){
		return (args) ->{
		Kysymys kys1 = new Kysymys("Mikä on lempivärisi");
		Kysymys kys2 = new Kysymys("Mikä on tavoitteesi tästä kurssista?");
		Kysymys kys3 = new Kysymys("Kevät vai saappaat?");
		repository.save(kys1);
		repository.save(kys2);
		repository.save(kys3);
			
		};
}
}
