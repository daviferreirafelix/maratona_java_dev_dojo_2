package com.Xserializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -1281725931763091985L;
    private int id;
    private String name;
    private transient String password;

    public Aluno(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
