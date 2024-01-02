package com.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/davi");
        Path clazz = Paths.get("/Auuu.java");
        Path windows = Paths.get("/maratona_java_dev_dojo_2");

        System.out.println(dir.relativize(windows));
    }
}
