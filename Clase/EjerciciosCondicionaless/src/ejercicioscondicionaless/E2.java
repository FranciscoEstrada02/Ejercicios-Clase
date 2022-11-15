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
public class E2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese un valor");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese otro valor");
        int valor2 = entrada.nextInt();
        
        if(valor1 > valor2){
            System.out.println("El primer valor es mayor: " + valor1);
        }else{
            if(valor2 > valor1){
                System.out.println("El segundo valor es mayor: " + valor2);
            }else{
                if(valor1 == valor2){
                    System.out.println("Los valores son iguales");
                }else{
                    System.out.println("Valor ingresado no validos");
                }
            }
        }
    }

}
