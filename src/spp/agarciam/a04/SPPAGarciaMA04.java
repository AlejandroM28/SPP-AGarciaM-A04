/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam.a04;
import java.util.Scanner;
/**
 *
 * @author alejandromonroy
 */
public class SPPAGarciaMA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double sen,cos,tan,A;
        int OPE;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("1. Calcular Tangente");
        System.out.println("2. Calcular Seno");
        System.out.println("3. Calcular Coseno");
        System.out.println("4. Salir");
        OPE = kb.nextInt ();
        switch (OPE){
            case 1: 
                System.out.println("Calcular Tangente");
                System.out.println("Dame un ángulo entre 0 y 360");
                A = kb.nextDouble();
                A = Math.toRadians(A);
                tan = Math.tan(A);
                System.out.println("El ángulo es: " + tan);
                break;
            case 2:
                System.out.println("Calcular Seno");
                System.out.println("Dame un ángulo entre 0 y 360");
                A = kb.nextDouble();
               
                    A = Math.toRadians(A);
                    sen = Math.sin(A);   
                    System.out.println("El ángulo es: " + sen);
                break;
            case 3:
                System.out.println("Calcular Coseno");
                System.out.println("Teclea un ángulo entre 0 y 360");
                A = kb.nextDouble();
                cos = Math.cos(A);
                System.out.println("El ángulo es: " + cos);
                break;
            case 4:
                System.out.println("Adiós!");
                break;    
    }
    
}
