/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensajeSuma="";
        String mensajeSumaDos="";
        
        int tabla;
        int limite;
        System.out.println("Ingrese la opcion que desea");
        int opcion = entrada.nextInt();
        System.out.println("Ingrese el primer valor");
        limite = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        tabla = entrada.nextInt();
        
        switch(opcion){
            case 1 : mensajeSuma = obtenerTablaSumar(limite, tabla);
            break;
            case 2 : mensajeSumaDos = obtenerTablaMultiplicar(limite, tabla);
            break;
            
        }
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
