package com.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) throws IOException {
        // Criar pastas e subpastas
        Path path = Paths.get("pasta");
        Path directory = Files.createDirectory(path);
        System.out.println("Diretório da pasta simples: " + directory);

        Path subPath = Paths.get("pasta/subpasta/subpasta2");
        Path directories = Files.createDirectories(subPath);
        System.out.println("Diretório das subpastas: " + directories);


        //Criar arquivos
        Path path1 = Path.of(subPath.toString(), "teste.txt");
        Files.createFile(path1);


        //Copiar e renomear arquivos
        Path origem = subPath;
        String arquivo = "novo_nome.txt";
        Path destinoDoArquivo = Paths.get(subPath.toString(), arquivo);

        Files.copy(origem, destinoDoArquivo);
    }
}
