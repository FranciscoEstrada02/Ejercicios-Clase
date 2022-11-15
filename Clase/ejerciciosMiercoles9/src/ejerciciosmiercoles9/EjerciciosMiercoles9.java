/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosmiercoles9;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class EjerciciosMiercoles9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String palabra = "dsaddddsdsdsdfsdfgdfgdfgsdfs";

        char a = 'a';
        char e = 'e';
        char is = 'i';
        char o = 'o';
        char u = 'u';
        
        for(int i = 0;i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
            if(palabra.charAt(i) == a || palabra.charAt(i) == e || palabra.charAt(i) == is 
                    || palabra.charAt(i) == o || palabra.charAt(i) == u ){
                break;
            }
            
        }

    }

}
