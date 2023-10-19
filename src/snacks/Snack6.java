package snacks;

//Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e
// mostri a video la stringa generata (secondi → “hh:mm:ss”)
public class Snack6 {

    public static void main(String[] args) {

        int secondi = 5432;
        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        secondi = secondi % 60;

        String orario = String.format("%02d:%02d:%02d", ore, minuti, secondi);
        System.out.println(orario);


    }
}
