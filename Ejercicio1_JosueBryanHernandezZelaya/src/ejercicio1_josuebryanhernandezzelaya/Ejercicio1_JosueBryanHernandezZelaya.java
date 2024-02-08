/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_josuebryanhernandezzelaya;
import java.util.Scanner;//Libreria que en usar de manera consola 

/**
 *
 * Ejercicio1: Escribir un programa que permita ingresar una palabra y un número, e imprima la
palabra el número de veces ingresado.
Nota: Usar sus respectivos tipos de datos (byte, short, int, long, float, double, char, boolean)
 */
public class Ejercicio1_JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner capturar = new Scanner(System.in);

        System.out.print("Escriba una palabra: ");
        String palabra_Escribir = capturar.next();

        System.out.print("Escribe en numero la cantidad que desea imprimir: " );
        int numero_Conteo = capturar.nextInt();

        for (int i = 0; i < numero_Conteo; i++) {
            System.out.println(palabra_Escribir);
        }
        capturar.close();
            
        
    }
    
}
//Josue Bryan Hernandez Zelaya
