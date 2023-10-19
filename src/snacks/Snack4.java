package snacks;

//Data in input una stringa verificare se è palindroma

import java.util.Arrays;
import java.util.Scanner;
public class Snack4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una parola ");
        String parola = scan.nextLine();

        char[] chars = new char[parola.length()];

        for(int i=0; i<parola.length();i++){

            chars[i] = parola.charAt(i);

        }

        char[] charsInversi = new char[parola.length()];

        for(int i = parola.length() - 1; i >= 0; i--){

            charsInversi[parola.length() - 1 - i] = parola.charAt(i);
        }

        boolean sonoUguali = true;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != charsInversi[i]) {
                    sonoUguali = false;
                    break;

            }
        }

        if (sonoUguali) {
            System.out.println("la parola è palindroma");
        } else {
            System.out.println("la parola non è palindroma");
        }
    }
        




}
