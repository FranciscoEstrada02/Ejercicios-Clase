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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un valor del 1 al 7");
        int valor1 = entrada.nextInt();
        
        if(valor1 == 1){
            System.out.println("Usted a seleccionado Lunes");
        }else{
            if(valor1 == 2){
                System.out.println("Usted a seleccionado Martes");
            }else{
                if(valor1 == 3){
                    System.out.println("Usted a seleccionado Miercoles");
                }else{
                    if(valor1 == 4){
                        System.out.println("Usted a seleccionado Jueves");
                    }else{
                        if(valor1 == 5){
                            System.out.println("Usted a seleccionado Viernes");
                        }else{
                            if(valor1 == 6){
                                System.out.println("Usted a seleccionado Sabado");
                            }else{
                                if(valor1 == 7){
                                    System.out.println("Usted a seleccionado Domingo");
                                }else{
                                    System.out.println("Valor ingresado no valido");
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
