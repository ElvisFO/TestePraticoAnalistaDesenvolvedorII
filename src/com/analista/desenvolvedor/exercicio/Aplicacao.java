package com.analista.desenvolvedor.exercicio;

import java.util.ArrayList;
import java.util.List;

import com.analista.desenvolvedor.exercicio.model.Palestra;
import com.analista.desenvolvedor.exercicio.util.Util;

public class Aplicacao {

	public static void main(String[] args) {
		
		ArrayList<Palestra> palestras = listaDePalestras();
		
		Util.retornaTrilha(palestras);

	}

	static ArrayList<Palestra> listaDePalestras() {
		ArrayList<Palestra> palestras = new ArrayList<>();
		palestras.add(new Palestra("Escrevendo testes rápidos", 60));
		palestras.add(new Palestra("Uma visão sobre Python", 45));
		palestras.add(new Palestra("Angular", 30));
		palestras.add(new Palestra("Otimizando aplicações com o NodeJS", 45));
		palestras.add(new Palestra("Erros comuns no desenvolvimento de software", 45));
		palestras.add(new Palestra("Rails para Desenvolvedores Python", 60));
		palestras.add(new Palestra("ASP.net MVC", 60));
		palestras.add(new Palestra("TDD na prática", 45));
		palestras.add(new Palestra("Woah", 30));
		palestras.add(new Palestra("Sente e escreva", 30));
		palestras.add(new Palestra("Pair Programming vs Noise", 45));
		palestras.add(new Palestra("Mobilidade em desenvolvimento", 60));
		palestras.add(new Palestra("Ruby on Rails: Por que devemos migrar para ele?", 60));
		palestras.add(new Palestra("Otimizando aplicações .NET", 45));
		palestras.add(new Palestra("Java e os novos paradigmas de programação", 30));
		palestras.add(new Palestra("Rubi vs. Clojure para Back-End", 30));
		palestras.add(new Palestra("Scrum para leigos", 60));
		palestras.add(new Palestra("Um mundo sem stackoverflow", 30));
		palestras.add(new Palestra("UX", 30));

		return palestras;
	}

}
