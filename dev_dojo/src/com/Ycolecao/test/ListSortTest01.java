package com.Ycolecao.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> manga = new ArrayList<>();

        manga.add("Hellsing");
        manga.add("Naruto");
        manga.add("Fairy Tail");
        manga.add("Evangelion");

        System.out.println(manga);

        Collections.sort(manga);

        System.out.println(manga);
    }
}
