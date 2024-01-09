package com.Ycolecao.test;

import com.Ycolecao.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(3L, "One Piece", 232L, 2));
        mangas.add(new Manga(0L, "Naruto", 210L, 4));
        mangas.add(new Manga(1L, "Dragon Ball", 234L, 1));
        mangas.add(new Manga(3L, "Beserk", 240L, 1));

        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 1);

        System.out.println(mangas);
    }
}
