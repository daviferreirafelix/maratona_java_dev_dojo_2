package com.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {

	public static void main(String[] args) {
		
			//Generics dão um tipo específico para os dados da lista
		List<String> lista = new ArrayList<>();
		
		lista.add("Naruto");
		lista.add("Goku");
		lista.add("Luffy");
		
		for (String nomes: lista) {
			System.out.println(nomes);
		}
	}
}
