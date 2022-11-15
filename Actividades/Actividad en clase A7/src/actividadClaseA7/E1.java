/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadClaseA7;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un  número");
        int valor = sc.nextInt();
        
        int contador1 = 0;
        int contador2 = 0;
        int i = 0;
        while(i <= valor){
            if(i % 2 == 0){
                contador1 = contador1 + i;
            }else if(i % 2 != 0){
                contador2 = contador2 + i;
            }
            
            i++;
            
        }
        
        System.out.println("Suma de pares es: " + contador1);
        System.out.println("Suma de impares es: " + contador2);
        if(contador1 > contador2){
            System.out.println("El mayor es: " + contador1);
        }else{
            System.out.println("El mayor es: " + contador2);
        }
    }

}
