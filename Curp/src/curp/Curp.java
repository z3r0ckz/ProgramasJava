
package curp;
//@ Zerock //
import java.util.Scanner;

public class Curp {
    public static void main(String[] args) {

    String nombre;
    String aPaterno;
    String aMaterno;
    String lugarNacimiento;
    String sexo;
    String curp  = new String(); //Nueva cadena donde se almacenara el curp//
    int anio;
    int mes;
    int dia;
    String enti="";
    String consAP;
    String consAM;
    String consNom;
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu Nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingresa tu apellido Paterno:");
        aPaterno = sc.nextLine();
        
        System.out.println("Ingresa el apellido materno:");
        aMaterno = sc.nextLine();
        
        System.out.println("Escribe fecha de nacimiento (En formato yyyy/mm/dd):");
        System.out.println("Escribe tu Año de nacimiento");
        anio = sc.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        mes = sc.nextInt();
        System.out.println("Ingresa tu dia de nacimiento");
        dia = sc.nextInt();        
                System.out.println("Escribe tu lugar de nacimiento:ESTADO");
        lugarNacimiento =  sc.nextLine();

        
        System.out.println("Escribe tu sexo (Hombre o Mujer):");
        sexo = sc.nextLine();
       //Error al meter estado no lo guarda y finaliza// 

        
        // Generacion de Curp //
            
            curp += aPaterno.charAt(0);
            for(int i=1; i <= aPaterno.length()-1; i++){ //Recorre las letras del apellido
                if(esVocal(aPaterno.charAt(i))){ //Si el caracter es vocal
                    curp+=aPaterno.charAt(i);    //Concatena la vocal al curp
                    break;                       
                }
            }

            curp += aMaterno.charAt(0);
            curp += nombre.charAt(0);
            curp += String.valueOf(anio).substring(2);// La función substring regresa los caracteres del string a partir de la posición indicada como paŕametro
            curp += mes ;                                                 
            curp += dia;
            curp += sexo.charAt(0);
            
          //If mamalon para convertir el estado a su abreviatura//
            //Saque las abreviaturas del glosario de calves de entidades federativas//
    	if(lugarNacimiento.equals("AGUASCALIENTES"))
    		enti = "AS";
    		else if(lugarNacimiento.equals("BAJA CALIFORNIA NTE."))
    			enti = "BC";
                else if(lugarNacimiento.equals("BAJA CALIFORNIA SUR"))
    			enti = "BS";
    		else if(lugarNacimiento.equals("CAMPECHE"))
                        enti = "CC";
                else if(lugarNacimiento.equals("CHIAPAS"))
    			enti = "CS";
                else if(lugarNacimiento.equals("CHIHUAHUA"))
                        enti = "CH";
                else if(lugarNacimiento.equals("COAHUILA"))
                        enti = "CL";
                else if(lugarNacimiento.equals("COLIMA"))
                        enti = "CM";
                else if(lugarNacimiento.equals("DISTRITO FEDERAL"))
                	enti = "DF";
                else if(lugarNacimiento.equals("DURANGO"))
    			enti = "DG";
                else if(lugarNacimiento.equals("GUANAJUATO"))
                        enti = "GT";
                else if(lugarNacimiento.equals("GUERRERO"))
    			enti = "GR";
    		else if(lugarNacimiento.equals("HIDALGO"))
    		        enti = "HG";
                else if(lugarNacimiento.equals("JALISCO"))
    			enti = "JC";
    		else if(lugarNacimiento.equals("MEXICO"))
    			enti = "MC";
    		else if(lugarNacimiento.equals("MICHOACAN"))
    			enti = "MN";
    		else if(lugarNacimiento.equals("MORELOS"))
    		        enti = "MS";
                else if(lugarNacimiento.equals("NAYARIT"))
                        enti = "NT";
    		else if(lugarNacimiento.equals("NUEVO LEON"))
                        enti = "NL";
    		else if(lugarNacimiento.equals("OAXACA"))
    			enti = "OC";
                else if(lugarNacimiento.equals("PUEBLA"))
                        enti = "PL";
    		else if(lugarNacimiento.equals("QUERETARO"))
    			enti = "QT";
    		else if(lugarNacimiento.equals("QUINTANA ROO"))
                        enti = "QR";
    		else if(lugarNacimiento.equals("SAN LUIS POTOSI"))
    			enti = "SP";
    		else if(lugarNacimiento.equals("SINALOA"))
    			enti = "SL";
    		else if(lugarNacimiento.equals("SONORA"))
    			enti = "SR";
    		else if(lugarNacimiento.equals("TABASCO"))
    			enti = "TC";
    		else if(lugarNacimiento.equals("TAMAULIPAS"))
    			enti = "TS";
    		else if(lugarNacimiento.equals("TLAXCALA"))
    			enti = "TL";
    		else if(lugarNacimiento.equals("VERACRUZ"))
    			enti = "VZ";
    		else if(lugarNacimiento.equals("YUCATAN"))
                        enti = "YN";
    		else if(lugarNacimiento.equals("ZACATECAS"))
                        enti = "ZS";
    	
                        curp += enti;
            
            consAP = aPaterno;
            for(int j=1; j <= consAP.length()-1; j++){ //Recorre las letras del apellido
                if(noVocal(consAP.charAt(j))){ //Si el caracter es consonante
                    curp+=consAP.charAt(j);   
            
            consAM = aMaterno;
            for(int k=1; k <= consAM.length()-1; k++){ //Recorre las letras del apellido
                if(noVocal(consAM.charAt(k))){ //Si el caracter es consonante
                    curp+=consAM.charAt(k);   
            
            consNom = nombre;
            for(int z=1; z <= consNom.length()-1; z++){ //Recorre las letras del apellido
                if(noVocal(consNom.charAt(z))){ //Si el caracter es vocal
                    curp+=consNom.charAt(z);   
            
                    //Homoclave//
        int homoclave;
        
        homoclave = (int) (Math.random() * 9);
        curp+= homoclave;
                //Digito verificador//
        
        int digito;
        digito = (int) (Math.random() * 9);
        curp+= digito;
        
        // Curp Completa ahora a Imprimirla  //
            System.out.println("CURP = " + curp.toUpperCase());
            
        }
        
    
    //fUNCION QUE IDENTIFICA LAS VOcALES EN LOS APELLIDOS
                    //el boolean sirve para valores verdaderos o falsos//
    public static boolean esVocal(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c =='u'){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean noVocal(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x =='u'){
            return false;
        }else{
            return true;
        }
    }
    
    
}
