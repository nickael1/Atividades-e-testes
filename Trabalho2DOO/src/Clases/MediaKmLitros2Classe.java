/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
/**
 *
 * @author nicka
 */
public class MediaKmLitros2Classe {
    
    String kilometragemInicial, litrosAbastecidos, kilometragemFinal;

    public MediaKmLitros2Classe(String kilometragemInicial, String litrosAbastecidos, String kilometragemFinal) {
        this.kilometragemInicial = kilometragemInicial;
        this.litrosAbastecidos = litrosAbastecidos;
        this.kilometragemFinal = kilometragemFinal;
    }

    public String getKilometragemInicial() {
        return kilometragemInicial;
    }

    public void setKilometragemInicial(String kilometragemInicial) {
        this.kilometragemInicial = kilometragemInicial;
    }

    public String getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(String litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }

    public String getKilometragemFinal() {
        return kilometragemFinal;
    }

    public void setKilometragemFinal(String kilometragemFinal) {
        this.kilometragemFinal = kilometragemFinal;
    }

    @Override
    public String toString() {
        return "MediaKmLitros2Classe{" + "kilometragemInicial=" + kilometragemInicial + ", litrosAbastecidos=" + litrosAbastecidos + ", kilometragemFinal=" + kilometragemFinal + '}';
    }
    
    

    
    
    
    
    
    
    
    
    
}
