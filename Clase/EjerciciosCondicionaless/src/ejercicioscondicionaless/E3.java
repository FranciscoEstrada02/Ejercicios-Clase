/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionaless;

import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese una dirección");
        String direccionOriginal = entrada.nextLine();
        
        
        if(direccionOriginal.equals("arriba")|| direccionOriginal.equals("Arriba")){
            System.out.println("Abajo");
        }else{
            if(direccionOriginal.equals("abajo") || direccionOriginal.equals("Abajo")){
                System.out.println("Arriba");
            }else{
                if(direccionOriginal.equals("derecha") || direccionOriginal.equals("Derecha")){
                    System.out.println("Izquierda");
                }else{
                    if(direccionOriginal.equals("izquierda") || direccionOriginal.equals("Izquierda")){
                        System.out.println("Derecha");
                    }else{
                        System.out.println("Dato no valido");
                    }
                }
            }
        }
    }

}
