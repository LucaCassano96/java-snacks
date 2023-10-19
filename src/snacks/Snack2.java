package snacks;

//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
// e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

import java.util.Random;

public class Snack2 {

    public static void main(String[] args) {

        String[] nomi = {"Luca", "Giacomo", "Giovanni", "Mario", "Paolo"};
        String[] cognomi = {"Bello", "Magico", "Simpatico", "Buffo", "Giovane"};

        Random random = new Random();

        for (String cognome : cognomi) {
            int index = random.nextInt(nomi.length);
            String nomeScelto = nomi[index];

            System.out.println(nomeScelto + " " + cognome);

        }
    }
}
