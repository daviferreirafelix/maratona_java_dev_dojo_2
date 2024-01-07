package com.Ycolecao.dominio;

import java.util.Comparator;

public class MangaComparatorById implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
