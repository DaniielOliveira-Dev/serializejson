package com.daniel;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Daniel", 24);

        Gson gson = new Gson();

        String json = gson.toJson(pessoa);

        System.out.println("Objeto convertido para JSON:");
        System.out.println(json);

    }
}