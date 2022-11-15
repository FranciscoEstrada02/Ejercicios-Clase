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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        int aumento = 5;
        
        System.out.println("Ingrese el valor de score");
        double score = entrada.nextDouble();
        
        if(score >= 80 && score <=90){
            score = score + aumento;
            System.out.println("El valor final de la variable es: " + score);
        }else{
            System.out.println("No se puede aumentar ya que no cumple la condicion");
        }
        
    }
    
}
