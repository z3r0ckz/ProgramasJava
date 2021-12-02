/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarcurp;
import java.util.Scanner;
/**
 *
 * @author Zerockz
 */
public class Validarcurp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Curp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu Curp:");
            Curp= scanner.next();
             Accesoo acceso;
        Accesoo Accesoo = acceso=new Accesoo();
        acceso.setCurp(Curp);
        validar v=new validar();
        v.validarSistema(Curp);
       
    }
    
}
