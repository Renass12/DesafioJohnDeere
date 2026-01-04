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

    Aluno a1 = new Aluno(null, "Renan", "renan@email.com", 9.0);
    Aluno a2 = new Aluno(null, "Jean", "jean@email.com", 4.0);
    Aluno a3 = new Aluno(null, "Carla", "carla@email.com", 9.2);
    Aluno a4 = new Aluno(null, "Daniel", "daniel@email.com", 5.5);
    Aluno a5 = new Aluno(null, "Eduarda", "eduarda@email.com", 7.8);
    Aluno a6 = new Aluno(null, "Felipe", "felipe@email.com", 4.0);
    Aluno a7 = new Aluno(null, "Gabriela", "gabriela@email.com", 9.7);
    Aluno a8 = new Aluno(null, "Henrique", "henrique@email.com", 3.5);
    Aluno a9 = new Aluno(null, "Isabela", "isabela@email.com", 6.9);
    Aluno a10 = new Aluno(null, "João", "joao@email.com", 8.0);

    Aula au1  = new Aula(null, Instant.parse("2025-06-21T07:37:08Z"), "Matemática");
    Aula au2  = new Aula(null, Instant.parse("2025-06-22T08:00:00Z"), "Português");
    Aula au3  = new Aula(null, Instant.parse("2025-06-23T09:15:00Z"), "História");
    Aula au4  = new Aula(null, Instant.parse("2025-06-24T10:30:00Z"), "Geografia");
    Aula au5  = new Aula(null, Instant.parse("2025-06-25T13:00:00Z"), "Física");
    Aula au6  = new Aula(null, Instant.parse("2025-06-26T14:45:00Z"), "Química");
    Aula au7  = new Aula(null, Instant.parse("2025-06-27T16:20:00Z"), "Biologia");
    Aula au8  = new Aula(null, Instant.parse("2025-06-28T18:00:00Z"), "Inglês");
    Aula au9  = new Aula(null, Instant.parse("2025-06-29T19:30:00Z"), "Filosofia");
    Aula au10 = new Aula(null, Instant.parse("2025-06-30T21:00:00Z"), "Sociologia");

    @Override
    public void run(String... args) throws Exception {
        alunoRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
        aulaRepository.saveAll(Arrays.asList(au1,au2,au3,au4,au5,au6,au7,au8,au9,au10));

        a1.getAulas().add(au1);
        a1.getAulas().add(au2);

        a2.getAulas().add(au2);
        a2.getAulas().add(au3);

        a3.getAulas().add(au1);
        a3.getAulas().add(au4);

        a4.getAulas().add(au5);

        a5.getAulas().add(au3);
        a5.getAulas().add(au6);

        a6.getAulas().add(au7);

        a7.getAulas().add(au4);
        a7.getAulas().add(au8);

        a8.getAulas().add(au9);

        a9.getAulas().add(au6);
        a9.getAulas().add(au10);

        a10.getAulas().add(au1);
        a10.getAulas().add(au5);
        a10.getAulas().add(au7);

        alunoRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
    }
}
