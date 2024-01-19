package com.Ycolecao.test;

import com.Ycolecao.dominio.Consumidor;
import com.Ycolecao.dominio.Manga;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Davi");
        Consumidor c2 = new Consumidor("Jose");

        Manga onePiece = new Manga(2L, "One Piece", 24L);
        Manga naruto = new Manga(1L, "Naruto", 20L);

        Map<Consumidor, Manga> map = new HashMap<>();

        map.put(c1, onePiece);
        map.put(c2, naruto);

        for (Map.Entry<Consumidor, Manga> entry: map.entrySet()){
            System.out.println("Consumidor: " + entry.getKey().getId() + ", Mangá: " + entry.getValue().getNome());
        }
    }
}
