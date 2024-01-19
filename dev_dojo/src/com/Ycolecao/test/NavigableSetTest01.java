package com.Ycolecao.test;

import com.Ycolecao.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class PriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        // o TreeSet só pode ser usado em classes que possuem ou o Comparable ou o Comparator
        // o TreeSet faz uso do método compareTo ou compare da classe escolhida para ordenar
        //automaticamente os objetos alocados
        // o TreeSet não faz uso do método equals, e sim do compareTo ou compare da prórpia classe
        //escolhida, portanto é necessário implementar ao menos um compare a classe ao usá-lo

        NavigableSet<Manga> mangas = new TreeSet<>(new PriceComparator());

        mangas.add(new Manga(2L, "One Piece", 24L));
        mangas.add(new Manga(1L, "Naruto", 20L));
        mangas.add(new Manga(3L, "Dragon Ball Z", 23L));
        mangas.add(new Manga(4L, "Evangelion", 22L));
        mangas.add(new Manga(5L, "Beserk", 26L));

        for (Manga manga: mangas){
            System.out.println(manga);
        }


        System.out.println("------------------------------");
        Manga ft = new Manga(34L, "Fairy Tail", 21L);

        // Ordenações:
        // lower <
        // higher >
        // floor <=
        // ceiling >=
        System.out.println(mangas.lower(ft));
        System.out.println(mangas.higher(ft));
        System.out.println(mangas.floor(ft));
        System.out.println(mangas.ceiling(ft));
    }
}
