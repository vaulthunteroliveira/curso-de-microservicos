package com.example.folhapagamento.entities;

import java.io.Serializable;


public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Double diaria;
	
	public Funcionario() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getDiaria() {
		return diaria;
	}
	public void setDiaria(Double diaria) {
		this.diaria = diaria;
	}
	
	
	
	

}
