/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.t01.p3;
//Agregar libreria, import.
import java.util.Scanner;


/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso 1. Definir variables
        int x1 , x2 , y1 , y2 ; 
        double D;
        // x1,x2,y1,y2= Coordenadas, D=distancia
        Scanner T = new Scanner (System.in);
        
        // Paso 2. Pedir datos.
        System.out.println("Introduce el punto x1");
        x1 = (int) T.nextDouble();
        System.out.println("Introduce el punto x2");
        x2 = (int) T.nextDouble();
        System.out.println("Introduce el punto y1");
        y1 = (int) T.nextDouble();
        System.out.println("Introduce el punto y2");
        y2 = (int) T.nextDouble();
        
        //Paso 3. Operaciones
        D = Math.sqrt(Math.pow((x1 + x2),2) + Math.pow((y1 + y2),2));
        
        //Paso 4. Mostrar resultado
        System.out.println("La distancia entre los punto es:" + D);
        
        
        
    }
    
}
