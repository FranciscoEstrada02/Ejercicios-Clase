/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miercoles19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class Miercoles19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        /*   int x, y;
        
        System.out.println("Introduce 2 números");
        
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        if(x == y){
            System.out.println("Los numeros son iguales");
        } else if (x >= y){
            System.out.println("El número mayor es: " + x);
        } else {
            System.out.println("El número mayor es: " + y);
        }
     entrada.close();   
         */
        //   Random random = new Random();
        //   int numerAleatorio = random.nextInt(-10, 11);
        //   System.out.println(numerAleatorio);
        String expresion = "uno";
        
        int x;
        
        switch (expresion) {
            case "uno":
                x = 1;
                System.out.println(x);
                break;
            default:
                x = 0;
                System.out.println(x);
                break;
        }
    }

}
