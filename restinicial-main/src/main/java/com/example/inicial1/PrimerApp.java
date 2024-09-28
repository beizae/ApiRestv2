package com.example.inicial1;

import com.example.inicial1.repositories.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerApp {
private static final Logger logger = LoggerFactory.getLogger(PrimerApp.class);


public static void main(String[] args) {
	SpringApplication.run(PrimerApp.class, args);

	System.out.println("Server Iniciado");
}

}
