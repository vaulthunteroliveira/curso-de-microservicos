package com.example.funcionarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.funcionarios.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
