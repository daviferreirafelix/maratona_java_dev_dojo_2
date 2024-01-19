package com.Ycolecao.test;

import com.Ycolecao.dominio.Consumidor;
import com.Ycolecao.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Davi");
        Consumidor c2 = new Consumidor("Jose");

        Manga onePiece = new Manga(2L, "One Piece", 24L);
        Manga naruto = new Manga(1L, "Naruto", 20L);

        //adicionando multiplos valores a uma mesma chave
        List<Manga> list = List.of(onePiece, naruto);
        List<Manga> list2 = List.of(naruto, onePiece);
        Map<Consumidor, List<Manga>> map = new HashMap<>();

        map.put(c1, list);
        map.put(c2, list2);

        for (Map.Entry<Consumidor, List<Manga>> entry: map.entrySet()){
            System.out.println("Consumidor: " + entry.getKey().getId());

            for(Manga mangas: entry.getValue()){
                System.out.println("-----------------------" + mangas.getNome());
            }
        }
    }
}
