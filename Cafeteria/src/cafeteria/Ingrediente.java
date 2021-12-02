/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author lenovo
 */
public class Ingrediente {
    String Descripcion;
    String Cantidad;
    public String getDescripcion(){
        return Descripcion;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion=Descripcion;
    }
     public String getCantidad(){
        return Cantidad;
    }
    public void setCantidad(String Cantidad){
        this.Cantidad=Cantidad;
    }
    
}
