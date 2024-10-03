package com.grupo_dos_associados.Acompanhamento.de.Mensalidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class AcompanhamentoDeMensalidadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcompanhamentoDeMensalidadesApplication.class, args);
	}

}
