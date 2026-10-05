public class Esercizio1 {
    public static void main(String[] args) {
        double[] temperature = {18.5, 21.0, 19.5, 23.0, 20.5, 22.0};

        double somma = 0;

        for (int i = 0; i < temperature.length; i++) {
            somma += temperature[i];
        }

        double media = somma / temperature.length;

        System.out.println("Somma = " + somma);
        System.out.println("Media = " + media);
    }
}