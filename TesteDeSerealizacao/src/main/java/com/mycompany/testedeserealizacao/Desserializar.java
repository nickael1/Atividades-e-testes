/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedeserealizacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Desserializar {

    public static void main(String[] args) {
        Pessoa pessoa = null;

        // Desserializando o objeto
        try {
            FileInputStream fileIn = new FileInputStream("pessoa.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            pessoa = (Pessoa) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Pessoa não encontrada.");
            c.printStackTrace();
        }

        // Exibir o objeto desserializado
        System.out.println("Objeto desserializado:");
        System.out.println(pessoa);
    }
}
