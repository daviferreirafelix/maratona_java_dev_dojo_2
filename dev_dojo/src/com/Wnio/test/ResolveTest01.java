package com.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get( "home/davi");
        Path arquivo = Paths.get("/home/arquivo.txt");

        System.out.println(dir.resolve(arquivo));
    }
}
