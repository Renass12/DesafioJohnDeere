package com.estudos.DesafioJD.config;

import com.estudos.DesafioJD.entities.Aluno;
import com.estudos.DesafioJD.entities.Aula;
import com.estudos.DesafioJD.repositories.AlunoRepository;
import com.estudos.DesafioJD.repositories.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AulaRepository aulaRepository;

    Aluno a1 = new Aluno(null, "Renan", "renan@email.com", 6.0);

    Aula au1 = new Aula(null, Instant.parse("2025-06-21T07:37:08Z"),"Matematica");
    Aula au2 = new Aula(null, Instant.parse("2025-06-21T07:37:08Z"),"Ciencias");
    Aula au3 = new Aula(null, Instant.parse("2025-06-21T07:37:08Z"),"Portugues");

    @Override
    public void run(String... args) throws Exception {
        alunoRepository.saveAll(Arrays.asList(a1));
        aulaRepository.saveAll(Arrays.asList(au1,au2,au3));

        a1.getAulas().add(au1);
        a1.getAulas().add(au2);
        a1.getAulas().add(au3);

        alunoRepository.saveAll(Arrays.asList(a1));
    }
}
