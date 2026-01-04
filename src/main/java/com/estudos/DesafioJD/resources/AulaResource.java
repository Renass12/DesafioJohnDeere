package com.estudos.DesafioJD.resources;

import com.estudos.DesafioJD.entities.Aula;
import com.estudos.DesafioJD.services.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/aulas")
public class AulaResource {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public ResponseEntity<List<Aula>> findAll(){
        List<Aula> list = aulaService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public Aula cadastraraula(@RequestBody Aula aula){
        return aulaService.save(aula);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        aulaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
