package com.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        // Criando a pasta
        File createFolder = new File("pasta");
        boolean result = createFolder.mkdir();
        System.out.println(result);

        // Criando o arquivo dentro da pasta
        File createArchive = new File(createFolder, "teste.txt");
        boolean result2 = createArchive.createNewFile();
        System.out.println(result2);

        //Renomeando o arquivo criado dentro da pasta
        File novoNome = new File(createFolder, "novo_nome.txt");
        boolean newName = createArchive.renameTo(novoNome);
        System.out.println(newName);

        //Renomeando diretorio
        File nomeDiretorio2 = new File("pasta2");
        boolean b = createFolder.renameTo(nomeDiretorio2);
        System.out.println(b);
    }
}
