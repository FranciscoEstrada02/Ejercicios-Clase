/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionaless;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese su posisicon en el eje X");
        double posicionEjeX = entrada.nextDouble();
        System.out.println("Ingrese su posicion en el eje Y");
        double posicionEjeY = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese una direcion haciadonde quiere ir");
        String movimiento = entrada.nextLine();
        
        if(movimiento.equals("arriba")){
            posicionEjeY = posicionEjeY + 1;
        }else{
            if(movimiento.equals("abajo")){
                posicionEjeY = posicionEjeY - 1;
            }else{
                if(movimiento.equals("derecha")){
                    posicionEjeX = posicionEjeX + 1;
                }else{
                    if(movimiento.equals("izquierda")){
                        posicionEjeX = posicionEjeX - 1;
                    }else{
                        System.out.println("Dato no valido intentelo denuevo");
                    }
                }
            }
        }
        System.out.println("Su posicion final en el eje X es: " + posicionEjeX);
        System.out.println("Su posicion final en el eje Y es: " + posicionEjeY);
    }

}
