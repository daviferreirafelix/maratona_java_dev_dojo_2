package com.Ycolecao.test;

import java.util.Map;
import java.util.TreeMap;

public class NavigableMapTest01 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		// INFORMAÇÃO IMPORTANTE SOBRE O NAIGABLEMAP
		// apenas o segundo tipo genérico não precisa utilizar ou comparator ou comparable
		// a ordenação é por padrão na ordem alfabética e utilizando o conteúdo escrito nas chaves
		
		map.put("Aome", "Davi");
		map.put("Bome", "Zé");
		map.put("Come", "Ana");
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// Os métodos existentes são semelhantes aos existentes em NavigableSet
	}

}
