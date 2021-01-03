package com.example.folhapagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.folhapagamento.entities.Pagamento;
import com.example.folhapagamento.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {
	
	@Autowired
	private PagamentoService service;
	
	@GetMapping(value = "/{funcionarioId}/dias/{dias}")
	private ResponseEntity<Pagamento> getPagamento(@PathVariable Long funcionarioId, @PathVariable int dias){
		Pagamento pagamento = service.getPagamento(funcionarioId, dias);
		return ResponseEntity.ok(pagamento);
	}

}
