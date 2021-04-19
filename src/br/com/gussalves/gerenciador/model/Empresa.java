package br.com.gussalves.gerenciador.model;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date data = new Date();
	
	public Empresa() {
	}

	public Empresa(String nome, Date dataAbertura) {
		super();
		this.nome = nome;
		this.data = dataAbertura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date dataAbertura) {
		this.data = dataAbertura;
	}

}