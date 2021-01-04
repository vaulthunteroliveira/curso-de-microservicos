package com.example.folhapagamento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.folhapagamento.entities.Funcionario;


@Component
@FeignClient(name = "funcionarios", url = "localhost:8001", path ="/funcionarios")
public interface FuncionariosFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Funcionario> findById(@PathVariable Long id);
}
