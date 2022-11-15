/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopslunes07;
import java.util.Scanner;
/**
 *
 * @author FranciscoEstradaCuen
 */
public class esPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a evaluar");
        int valor = sc.nextInt();
        
        int divisibles = 0;
        int indice = valor;
        
        
        while(indice > 0){
            if(valor % indice == 0){
                divisibles++;
            }
            indice--;
        }
        if(divisibles <= 2){
            System.out.println("Primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
