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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un valor absoluto");
        int valor = entrada.nextInt();
        
        if(valor > 0){
            int absolutoPositivo = valor;
            System.out.println("El valor absoluto de |" + valor + "| es : " + absolutoPositivo );
        }else{
            if(valor < 0){
                int absolutoNegativo = valor * -1;
                System.out.println("El valor absoluto de |" + valor + "| es: " + absolutoNegativo);
            } else{
                System.out.println("El valor absoluto de |" + valor + "| es: " + valor);
            }
        }
        
    }
    
}
