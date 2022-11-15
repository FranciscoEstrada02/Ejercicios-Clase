/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();

        int valorAbsoluto = (numero < 0) ? -(numero) : numero;

        System.out.println(valorAbsoluto);
    }

}
