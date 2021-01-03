package com.example.funcionarios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.funcionarios.entities.Funcionario;
import com.example.funcionarios.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll(){
		List<Funcionario> list =  repo.findAll(); 
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Long id ){
		Funcionario obj =  repo.findById(id).get(); 
		return ResponseEntity.ok(obj);
	}
	

}
