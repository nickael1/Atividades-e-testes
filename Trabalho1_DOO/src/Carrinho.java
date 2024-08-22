
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicka
 */
public class Carrinho {
    private ArrayList<Produtos> carrinhos;

    public Carrinho() {
        this.carrinhos = new ArrayList();
    }

    public ArrayList<Produtos> getCarrinho() {
        return carrinhos;
    }

    public void setCarrinho(ArrayList<Produtos> carrinho) {
        this.carrinhos = carrinhos;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "carrinhos=" + carrinhos + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

