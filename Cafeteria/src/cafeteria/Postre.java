/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafeteria;

import cafeteria.Ingrediente;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Postre {
     String id;
    String nombre;
    String precio;
    String calorias;
    String peso;
   private List<Ingrediente>Ingredientes;

 public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id=id;
     }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
   
    public String getprecio(){
        return precio;
    }
    public void setprecio(String precio){
        this.precio=precio;
    }
    public String getcalorias(){
        return calorias;
    }
    public void setcalorias(String calorias){
        this.calorias=calorias;
    }
    public String getpeso(){
        return peso;
    }
    public void setpeso(String peso){
        this.peso=peso;
    }

    public List<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(List<Ingrediente> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

}