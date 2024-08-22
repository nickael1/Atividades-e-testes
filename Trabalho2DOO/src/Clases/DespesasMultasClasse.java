/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nicka
 */
public class DespesasMultasClasse implements Serializable{
    
    String tipo;
    String valor, data;

    public DespesasMultasClasse(String tipo, String valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DespesasMultasClasse{" + "tipo=" + tipo + ", valor=" + valor + ", data=" + data + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
