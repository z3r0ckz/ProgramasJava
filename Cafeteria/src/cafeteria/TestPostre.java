/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class TestPostre {
    public static void main(String[] args) {
        Postre postre1=new Postre();
        
        postre1.setnombre("Pastel de Chocolate");
        postre1.setpeso("500kg");
        
        Ingrediente ingrediente1=new Ingrediente();
        ingrediente1.setDescripcion("Huevos");
        ingrediente1.setCantidad("3 Piezas");
         Ingrediente ingrediente2=new Ingrediente();
        ingrediente2.setDescripcion("Harina");
        ingrediente2.setCantidad("1Kg");
         Ingrediente ingrediente3=new Ingrediente();
          ingrediente3.setDescripcion("Leche");
        ingrediente3.setCantidad("2 Lt");
        
        List<Ingrediente> lista;
        lista = new ArrayList<>();
   lista.add(ingrediente1);
   lista.add(ingrediente2);
   lista.add(ingrediente3);
        
   System.out.println("Nombre\n"+postre1.getnombre());
    System.out.println("Peso\n"+postre1.getpeso());
    System.out.println("peso\n"+List<Ingrediente> lista.getIngredientes());

        
        
    
}
    
}
