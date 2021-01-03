package com.example.folhapagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.folhapagamento.entities.Funcionario;
import com.example.folhapagamento.entities.Pagamento;

@Service
public class PagamentoService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${funcionarios.host}")
	private String funcionariosHost;

	public Pagamento getPagamento(Long funcionarioId, int dias) {
		Map<String, String> map = new HashMap<>();
		map.put("id", String.valueOf(funcionarioId));

		Funcionario funcionario = restTemplate.getForObject(
				funcionariosHost + "/funcionarios/{id}", 
				Funcionario.class,
				map);

		return new Pagamento(funcionario.getNome(), funcionario.getDiaria(), dias);
	}
}
