/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.brutality;

/**
 *
 * @author c0662834
 */
public class CPD4414Assignment1Brutality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static String stringPower(String a, int b) {

        if (a == "") {
            return "";
        } else if (b < 1) {
            return null;
        } else if (b == 1) {
            return a;
        } else if (b == 2) {
            return a + a;
        } else {
            return "";
        }
    }

}
