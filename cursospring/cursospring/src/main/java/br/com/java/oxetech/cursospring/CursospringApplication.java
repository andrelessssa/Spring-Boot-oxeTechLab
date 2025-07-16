package br.com.java.oxetech.cursospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.java.oxetech.cursospring.service.MeusServico;

@SpringBootApplication
public class CursospringApplication{

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
		System.out.println("Olá Alunos");
		
	}
	@Autowired
	private MeusServico meusServico;

	




}
