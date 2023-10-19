package snacks;


import java.util.Scanner;

//Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
//Se il numero è negativo termina.
public class Snack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero: ");
            int numero = scan.nextInt();

            if (numero %2 == 0) {
                System.out.println(numero);
            } else if (numero %2 == 1) {
                System.out.println(numero + 1);
            }
            else if (numero < 0){
                break;
            }

        }
        scan.close();
    }
}
