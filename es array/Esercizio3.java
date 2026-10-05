import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int voto;
        int promossi = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Inserisci il voto " + i + ": ");
            voto = input.nextInt();

            if (voto >= 6) {
                promossi++;
            }
        }

        System.out.println("Numero di voti maggiori o uguali a 6: " + promossi);

        input.close();
    }
}