package com.Ycolecao.test;

import com.Ycolecao.dominio.Manga;
import com.Ycolecao.dominio.MangaComparatorById;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        MangaComparatorById comparator = new MangaComparatorById();

        mangas.add(new Manga(2L, "One Piece", 24L));
        mangas.add(new Manga(1L, "Naruto", 20L));
        mangas.add(new Manga(3L, "Dragon Ball Z", 23L));
        mangas.add(new Manga(4L, "Evangelion", 22L));
        mangas.add(new Manga(5L, "Beserk", 26L));
        mangas.add(new Manga(0L, "Attack on Titan", 23L));
        Manga mangaSearch = new Manga(0L, "Attack on Titan", 23L);

        Collections.sort(mangas);

        for(Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-------------------------------------------------");

        mangas.sort(comparator);

        for(Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println(Collections.binarySearch(mangas, mangaSearch, comparator));
    }
}
