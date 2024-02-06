package com.Ycolecao;

import java.util.PriorityQueue;
import java.util.Queue;

import com.Ycolecao.dominio.Manga;
import com.Ycolecao.dominio.MangaComparatorById;

public class QueueTest01 {

	public static void main(String[] args) {
		// INFORMAÇÃO IMPORTANTE
		// a queue, assim como o Map, não aceita elementos que não sejam de uma classe Comparable
		
												//Definindo a prioridade de ordenação pelo Comparator
		Queue<Manga> mangas = new PriorityQueue<>(new MangaComparatorById());
		
		Manga manga = new Manga(3L, "One Piece", 26L, 2);
		Manga manga2 = new Manga(2L, "Attack On Titan", 23L, 3);
		Manga manga3 = new Manga(1L, "Evangelion", 28L, 1);
		
		mangas.add(manga);
		mangas.add(manga2);
		mangas.add(manga3);
		
		while(!mangas.isEmpty()) {
			System.out.println(mangas.poll());
		}
	}

}
