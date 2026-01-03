package com.estudos.DesafioJD.services;

import com.estudos.DesafioJD.entities.Aluno;
import com.estudos.DesafioJD.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    public Aluno findById(Long id){
        Optional<Aluno> obj = alunoRepository.findById(id);
        return obj.get();
    }

    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public void deleteById(Long id){
        alunoRepository.deleteById(id);
    }

}
