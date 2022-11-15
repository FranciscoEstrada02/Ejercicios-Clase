/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionaless;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author FranciscoEstradaCuen
 */
public class E5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduzca su eleccion"
                + "\n1: Piedra"
                + "\n2: Papel"
                + "\n3: Tijera");
        int opcionUsuario = entrada.nextInt();
        int opcionAleatoria = 1 + aleatorio.nextInt(3);

        if (opcionUsuario <= 0 || opcionUsuario > 3) {
            System.out.println("Opcion no valida");
        } else {
            if (opcionAleatoria == 1) {
                System.out.println("Opcion elegida por el ordenador: Piedra");
            } else {
                if (opcionAleatoria == 2) {
                    System.out.println("Opcion elegida por el ordenador: Papel");
                } else {
                    if (opcionAleatoria == 3) {
                        System.out.println("Opcion elegida por el ordenador: Tijera");
                    }
                }
            }
        }

        if (opcionAleatoria == opcionUsuario) {
            System.out.println("Empate"
                    + "\nIntentalo de nuevo");
        } else {
            if ((opcionAleatoria == 1 && opcionUsuario == 2)
                    || (opcionAleatoria == 2 && opcionUsuario == 3)
                    || (opcionAleatoria == 3 && opcionUsuario == 1)) {
                System.out.println("Has ganado, Felicidades!!!");
            } else {
                if ((opcionAleatoria == 2 && opcionUsuario == 1)
                        || (opcionAleatoria == 3 && opcionUsuario == 2)
                        || (opcionAleatoria == 1 && opcionUsuario == 3)) {
                    System.out.println("Has perdido"
                            + "\nIntentalo de nuevo");
                }
            }
        }

    }
}
