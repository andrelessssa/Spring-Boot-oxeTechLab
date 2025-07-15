package br.com.java.oxetech.cursospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursospringApplication implements ComandLinerunner {

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
		System.out.println("Olá Alunos");
	}

}
