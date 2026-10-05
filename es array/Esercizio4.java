public class Esercizio4 {
    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i = 0; i < matrice.length; i++) {
            int somma = 0;

            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[i][j];
            }

            System.out.println("Somma riga " + i + " = " + somma);
        }
    }
}