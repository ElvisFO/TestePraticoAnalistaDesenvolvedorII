package com.analista.desenvolvedor.exercicio.util;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.analista.desenvolvedor.exercicio.model.Palestra;

public class Util {

	public static void retornaTrilha(List<Palestra> palestras) {

		
		List<Palestra> segundaTrilha = new ArrayList<>();
		List<Palestra> primeiraTrilha = new ArrayList<>();
		List<Palestra> listaOrdenada = null;
		Map<String, List<Palestra>> mapList = new HashMap<String, List<Palestra>>();
		
		palestras = orderPalestraPorDuracao(palestras);

		
		mapList = retornaLista(palestras);
		palestras = mapList.get("sub");
		primeiraTrilha = mapList.get("trilha");
		
		
		mapList = retornaLista(palestras);
		segundaTrilha = mapList.get("trilha");
		
		System.out.println("Trilha 1");
		
		for (Palestra palestra : primeiraTrilha) {
			System.out.println(palestra.getHoraInicio()+" " +palestra.getNome()+" " +palestra.getDuracao()+"min");
		}

		System.out.println("Trilha 2");
		
		for (Palestra palestra : segundaTrilha) {
			System.out.println(palestra.getHoraInicio()+" " +palestra.getNome()+" " +palestra.getDuracao()+"min");
		}

	}
	
	private static Map<String, List<Palestra>> retornaLista(List<Palestra> paletras) {
		
		Map<String, List<Palestra>> map = new HashMap<String, List<Palestra>>();
		LocalTime horaInicio = LocalTime.of(9, 0);
		boolean primeiroHorario = true;
		List<Palestra> listaAux1 = new ArrayList<>();
		Integer duracaoAnterior = 0;
		LocalTime horaAtual = null;
		int count = 1;
		
		for (Palestra palesta : paletras) {

			if (!primeiroHorario)
				horaInicio = horaInicio.plusMinutes(duracaoAnterior);

			int horasIguais = horaInicio.compareTo(LocalTime.of(12, 0));

			horaAtual = horaInicio;

			if (horasIguais == 0) {
				listaAux1.add(new Palestra("Almoço", 60, LocalTime.of(12, 0)));
				listaAux1.add(palesta);
				horaInicio = horaInicio.plusMinutes(60);
				//palesta.setSomatorio(60);
			}

			if (horaAtual.isBefore(LocalTime.of(12, 0))) {
				if (primeiroHorario) {
					palesta.setHoraInicio(horaInicio);
					primeiroHorario = false;
					listaAux1.add(palesta);
					duracaoAnterior = palesta.getDuracao();
					count++;
					continue;
				}

				listaAux1.add(palesta);
				count++;

			} else if (horaAtual.isAfter(LocalTime.of(12, 0)) && horaAtual.isBefore(LocalTime.of(17, 0))) {
				listaAux1.add(palesta);
				count++;
				
				if(palesta.getDuracao()== 60 && horaAtual.compareTo(LocalTime.of(16, 0)) == 0)
					listaAux1.add(new Palestra("Evento de Networking", 0, LocalTime.of(17, 0)));
				
			} else if (horaAtual.compareTo(LocalTime.of(17, 0)) == 0) {
				listaAux1.add(new Palestra("Evento de Networking", 0, LocalTime.of(17, 0)));
			}
			

			if (!primeiroHorario)
				palesta.setHoraInicio(horaInicio);

			duracaoAnterior = palesta.getDuracao();
		}
		
		
		List<Palestra> sub = paletras.subList(count, paletras.size());
		map.put("sub", sub);
		map.put("trilha", listaAux1);
		
		return map;
	}

	
	private static List<Palestra>  orderPalestraPorDuracao(List<Palestra> palestras) {

		List<Palestra> listaOrdernada = null;
		Palestra[] arrayOrdenado = new Palestra[19];
		
		for(Palestra p : palestras) {
			
			if(p.getNome().startsWith("Escrevendo testes")) {
				arrayOrdenado[0] = p;
			}
			if(p.getNome().startsWith("Uma visão sobre Python")) {
				arrayOrdenado[1] = p;
			}
			if(p.getNome().startsWith("Angular")) {
				arrayOrdenado[2] = p;
			}
			if(p.getNome().endsWith("aplicações com o NodeJS")){
				arrayOrdenado[3] = p;
			}
			if(p.getNome().startsWith("Ruby on Rails:")){;
				arrayOrdenado[4] = p;
			}
			if(p.getNome().startsWith("Erros comuns")){
				arrayOrdenado[5] = p;
			}
			if(p.getNome().startsWith("Pair Programming")){
				arrayOrdenado[6] = p;
			}
			if(p.getNome().startsWith("Java e os novos")){
				arrayOrdenado[7] = p;
			}
			if(p.getNome().startsWith("Rubi vs. Clojure")){
				arrayOrdenado[8] = p;
			}
			if(p.getNome().startsWith("UX")){
				arrayOrdenado[9] = p;
			}
			if(p.getNome().startsWith("ASP.net")){
				arrayOrdenado[10] = p;
			}
			if(p.getNome().startsWith("Mobilidade")) 
			{
				arrayOrdenado[11] = p;
			}
			if(p.getNome().startsWith("Woah")){
				arrayOrdenado[12] = p;
			}
			if(p.getNome().startsWith("Sente")){
				arrayOrdenado[13] = p;
			}
			if(p.getNome().startsWith("TDD")){
				arrayOrdenado[14] = p;
			}
			if(p.getNome().endsWith("aplicações .NET")){
				arrayOrdenado[15] = p;
			}
			if(p.getNome().startsWith("Um mundo sem")){
				arrayOrdenado[16] = p;
			}
			if(p.getNome().startsWith("Scrum")){
				arrayOrdenado[17] = p;
			}
			if(p.getNome().startsWith("Rails para")){
				arrayOrdenado[18] = p;
			}
				
		}
		
		listaOrdernada = Arrays.asList(arrayOrdenado);
		
		return listaOrdernada;
	}
	
}
