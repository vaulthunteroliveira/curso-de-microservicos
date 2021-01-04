package com.example.folhapagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.folhapagamento.entities.Funcionario;
import com.example.folhapagamento.entities.Pagamento;
import com.example.folhapagamento.feignclients.FuncionariosFeignClient;

@Service
public class PagamentoService {

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private FuncionariosFeignClient funcionariosFeignClient;

//	@Value("${funcionarios.host}")
//	private String funcionariosHost;

	public Pagamento getPagamento(Long funcionarioId, int dias) {
//		Map<String, String> map = new HashMap<>();
//		map.put("id", String.valueOf(funcionarioId));
//
//		Funcionario funcionario = restTemplate.getForObject(
//				funcionariosHost + "/funcionarios/{id}", 
//				Funcionario.class,
//				map);
		
		Funcionario funcionario = funcionariosFeignClient.findById(funcionarioId).getBody();

		return new Pagamento(funcionario.getNome(), funcionario.getDiaria(), dias);
	}
}
