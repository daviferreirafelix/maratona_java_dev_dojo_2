package com.Ycolecao.test;

import com.Ycolecao.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();

        // Diferente do List, o Set não permite duplicação de dados

        mangas.add(new Manga(3L, "One Piece", 232L, 2));
        mangas.add(new Manga(0L, "Naruto", 210L, 4));
        mangas.add(new Manga(1L, "Dragon Ball", 234L, 1));
        mangas.add(new Manga(3L, "Beserk", 240L, 1));
        mangas.add(new Manga(3L, "Beserk", 240L, 1));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
