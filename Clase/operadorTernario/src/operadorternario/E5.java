/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadorternario;
import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese la capacidad");
        int añoNacimiento = entrada.nextInt(); 

        String edad = (añoNacimiento == 2004) ? ">=18" : "<18";

        System.out.println(edad);
    }
}
