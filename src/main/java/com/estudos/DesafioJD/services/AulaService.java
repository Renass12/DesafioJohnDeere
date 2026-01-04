package com.estudos.DesafioJD.services;

import com.estudos.DesafioJD.entities.Aula;
import com.estudos.DesafioJD.repositories.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public List<Aula> findAll(){
        return aulaRepository.findAll();
    }

    public Aula findById(Long id){
        Optional<Aula> obj = aulaRepository.findById(id);
        return obj.get();
    }

    public Aula save(Aula aula){
        return aulaRepository.save(aula);
    }

    public void deleteById(Long id){
        aulaRepository.deleteById(id);
    }

}
