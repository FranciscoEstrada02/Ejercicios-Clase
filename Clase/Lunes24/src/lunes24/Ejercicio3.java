/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lunes24;
import java.util.Scanner;
/**
 *
 * @author FranciscoEstradaCuen
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para evaluarlo");
        int valor = entrada.nextInt();
        
        if(valor % 2 == 0 && valor >= 0){
            System.out.println("El valor ingresado es: " + valor + " y es positivo y par");
        }else{
            System.out.println("El valor ingresado eno cumple las condiciones");
        }
        
    }
    
}
