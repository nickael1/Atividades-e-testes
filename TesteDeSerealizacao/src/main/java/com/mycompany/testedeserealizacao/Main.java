package com.mycompany.testedeserealizacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando os dados do usuário
        System.out.println("Fale seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Fale sua idade:");
        int idade = scanner.nextInt();

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa(nome, idade);

        // Serializando o objeto
        try {
            FileOutputStream fileOut = new FileOutputStream("pessoa.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(pessoa);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado em pessoa.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}