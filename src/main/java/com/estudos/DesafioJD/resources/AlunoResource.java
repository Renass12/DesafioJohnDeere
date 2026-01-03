package com.estudos.DesafioJD.resources;

import com.estudos.DesafioJD.entities.Aluno;
import com.estudos.DesafioJD.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> list = alunoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return alunoService.save(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        alunoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
