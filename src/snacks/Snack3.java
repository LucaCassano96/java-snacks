package snacks;

//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class Snack3 {

    public static void main(String[] args) {

        int[] numeri = {22, 33, 23, 14, 15, 70, 73, 81, 93};

        int somma = 0;

        for (int i = 0; i < numeri.length; i++) {

            if (i % 2 == 1) {
                somma += numeri[i];
            }
        }
        System.out.println(somma);
    }
}
