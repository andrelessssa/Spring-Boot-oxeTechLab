package br.com.java.oxetech.cursospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.java.oxetech.cursospring.service.MeusServico;

@SpringBootApplication
public class CursospringApplication implements CommandLineRunner {

    @Autowired
    private MeusServico meusServico;

    public static void main(String[] args) {
        SpringApplication.run(CursospringApplication.class, args);
    }

    @Override
    public void run(String... args) {
        meusServico.executar();
    }



}
