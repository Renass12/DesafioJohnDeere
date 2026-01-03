package com.estudos.DesafioJD.repositories;

import com.estudos.DesafioJD.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
