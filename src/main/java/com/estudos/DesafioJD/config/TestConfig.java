package com.estudos.DesafioJD.config;

import com.estudos.DesafioJD.entities.Aluno;
import com.estudos.DesafioJD.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    Aluno a1 = new Aluno(null, "Renan", "renan@email.com", 6.0);


    @Override
    public void run(String... args) throws Exception {
        alunoRepository.saveAll(Arrays.asList(a1));
    }
}
