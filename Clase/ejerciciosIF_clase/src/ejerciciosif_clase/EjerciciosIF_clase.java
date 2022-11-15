/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosif_clase;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class EjerciciosIF_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();

        if (edad >= 80) {
            System.out.println("Es mayor que 80");
        } else if (edad >= 50) {
            System.out.println("Es mayor que 50");
        }  else if (edad >= 10) {
            System.out.println("Es mayor que 10");
        }
        
        System.out.println(nombre);
        entrada.close();
    }

}
