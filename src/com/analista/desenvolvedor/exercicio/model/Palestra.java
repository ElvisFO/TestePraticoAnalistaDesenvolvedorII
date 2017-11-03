package com.analista.desenvolvedor.exercicio.model;

import java.time.LocalTime;

public class Palestra {

	private String nome;
	private Integer duracao;
	private LocalTime horaInicio;
	private static Integer somatorio = 0;
	
	public Palestra() {
	}
	
	public Palestra(String nome, Integer duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public Palestra(String nome, Integer duracao, LocalTime horaInicio) {
		this.nome = nome;
		this.duracao = duracao;
		this.horaInicio = horaInicio;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Override
	public String toString() {
		return "Palestra [nome=" + this.nome + ", duracao=" + this.duracao + ", horaInicio=" + this.horaInicio + "]";
	}
	
	public Integer getSomatorio() {
		return this.somatorio += this.duracao;
	}
	
	public void setSomatorio(Integer somatorio) {
		this.somatorio =+ somatorio;
	}
	
	

}
