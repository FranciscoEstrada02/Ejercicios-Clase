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
public class E2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese su sueldo");
        int sueldoBase = entrada.nextInt();
        int bono = 200;
        int sueldoFinal;
        String trabajador = "tiene bono";

        sueldoFinal = (trabajador == "tiene bono") ? sueldoBase + bono : sueldoBase;

        System.out.println("Este es su sueldo final: " + sueldoFinal);
    }
}
