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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = entrada.nextInt();
        
        int diferencia = Math.abs(valor1 - valor2);
        
        if(diferencia < 10 && diferencia >= 0){
            System.out.println("La diferencia de estos dos valores es menor que 10");
        }else{
            System.out.println("No cumple con la condicion");
        }
        
    }
    
}
