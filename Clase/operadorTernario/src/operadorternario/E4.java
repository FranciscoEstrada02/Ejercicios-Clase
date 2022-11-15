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
public class E4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese la capacidad");
        int capacidad = entrada.nextInt(); 

        String botella = (capacidad > 30) ? "Medio llena" : "Medio vacia";

        System.out.println(botella);
    }
}
