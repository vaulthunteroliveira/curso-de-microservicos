package com.example.folhapagamento.services;

import org.springframework.stereotype.Service;

import com.example.folhapagamento.entities.Pagamento;

@Service
public class PagamentoService {

	public Pagamento getPagamento(Long funcionarioId, int dias) {
		return new Pagamento("Alex", 500.0, dias);
	}
}
