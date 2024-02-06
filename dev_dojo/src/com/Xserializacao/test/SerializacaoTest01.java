package com.Xserializacao.test;

import com.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123, "Ze", "abc");
        //serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/objetoSerializado.abc");

        try(ObjectOutputStream obj = new ObjectOutputStream(Files.newOutputStream(path))){
            obj.writeObject(aluno);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/objetoSerializado.abc");

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Object o = ois.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
