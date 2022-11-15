/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropar;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumaPares = 0;

        for (int i = 20; i <= 30; i++) {
            if (i % 2 == 0) {
                sumaPares = sumaPares + i;
            }
        }
        System.out.println(sumaPares);

    }

}
