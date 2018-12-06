import javax.swing.*;

public class Aufgabe2 {
    public static void main(String[] args){
                                                                                     //zu Aufgabe 2:
        partialString(JOptionPane.showInputDialog("Geben Sie einen String ein!"));


                                                                                     //zu Aufgabe 3:
        System.out.println(Aufgabe3Taschenrechner.addieren(5, 10.5));
        System.out.println(Aufgabe3Taschenrechner.subtrahieren(5, 10.5));
        System.out.println(Aufgabe3Taschenrechner.multiplizieren(5, 10.5));
        System.out.println(Aufgabe3Taschenrechner.dividiere(5, 10.5));
    }
    private static void partialString(String s){
        String half = s.substring(s.length()/2);
        System.out.println(half);

        if(s.length() < 3){
            System.err.println("Error - unter 3 Zeichen!");
        }else{
            System.out.println("Original-String = " + s + ", geteilt = " + half);
        }
    }
}
