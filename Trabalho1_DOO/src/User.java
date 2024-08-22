/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author nicka
 */
public class User {
    private ArrayList<Usuario> usuarios;

    public User(ArrayList<Usuario> usuario) {
        this.usuarios = usuario;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuarios = usuario;
    }

    @Override
    public String toString() {
        return "User{" + "usuario=" + usuarios + '}';
    }
    
    
}
