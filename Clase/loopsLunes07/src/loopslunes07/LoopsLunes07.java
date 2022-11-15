/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslunes07;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class LoopsLunes07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String login;
        String myLogin;
        String myPwd;
        String pwd;

        myLogin = "Fran";
        myPwd = "1234";

        boolean condicion = true;
        int contador = 3;

        while (condicion && contador > 0) {
            System.out.println("Login: ");
            login = sc.next();
            System.out.println("Pwd: ");
            pwd = sc.next();

            if (login.equals(myLogin) && pwd.equals(myPwd)) {
                System.out.println("Bienvenido " + login);
                condicion = false;
            } else {
                System.out.println("Usuario o contraseña incorrecta");
            }
            contador--;

        }
        if (contador == 0 && !condicion) {
            System.out.println("Intentos permitios superados, intentalo mas tarde");
        }
        
        sc.close();
    }
}
