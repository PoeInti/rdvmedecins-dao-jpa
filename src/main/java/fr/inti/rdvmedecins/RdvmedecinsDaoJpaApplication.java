package fr.inti.rdvmedecins;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.inti.rdvmedecins.crud.ClientRepository;
import fr.inti.rdvmedecins.crud.CreneauRepository;
import fr.inti.rdvmedecins.crud.MedecinRepository;
import fr.inti.rdvmedecins.crud.RvRepository;




@SpringBootApplication
public class RdvmedecinsDaoJpaApplication {


	  Date jour = new Date();
	private static final Logger log = LoggerFactory.getLogger(RdvmedecinsDaoJpaApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(RdvmedecinsDaoJpaApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(ClientRepository clr , MedecinRepository medr , RvRepository rvr , CreneauRepository crr) {
		return (args) -> {
			
		log.info("Demarrage");
		
		
	log.info("Consulter les clients");
		
		System.out.println(clr.findAll());
		
		log.info("Consulter les Medecins");	
		System.out.println(medr.findAll());
		log.info("Consulter les Rendez-vous");	
		System.out.println(rvr.findAll());
		
		log.info("Consulter les Rendez-vous");	
		System.out.println(crr.findAll());
	   
		} ;
	}
	

}
