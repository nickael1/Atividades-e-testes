
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class Supermercado {
    private ArrayList<Produtos> produtos;

    public Supermercado() {
        this.produtos = new ArrayList();
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "produtos=" + produtos + '}';
    }
    
    
}
