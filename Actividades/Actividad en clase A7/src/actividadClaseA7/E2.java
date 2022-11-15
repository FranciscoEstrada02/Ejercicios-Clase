/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadClaseA7;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor inicial");
        int valor1 = sc.nextInt();
        System.out.println("Introduzca un valor final");
        int valor2 = sc.nextInt();
        int suma = 0;
        
        for(int i = valor1; i <= valor2; i++){
            System.out.println(i);
            if(valor1 == -1 || valor2 == -1){
                System.out.println("Proceso terminado");
                break;
            }
        }       
       

    }
}
