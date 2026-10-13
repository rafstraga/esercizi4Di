import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome della figura generica: ");
        String nomeFigura = input.nextLine();

        System.out.print("Inserisci il raggio del cerchio: ");
        double raggioCerchio = input.nextDouble();

        System.out.print("Inserisci il raggio del cilindro: ");
        double raggioCilindro = input.nextDouble();

        System.out.print("Inserisci l'altezza del cilindro: ");
        double altezzaCilindro = input.nextDouble();

        FiguraGeometrica[] figure = new FiguraGeometrica[3];

        figure[0] = new FiguraGeometrica(nomeFigura);
        figure[1] = new Cerchio("Cerchio", raggioCerchio);
        figure[2] = new Cilindro("Cilindro", raggioCilindro, altezzaCilindro);

        System.out.println("\n--- VISUALIZZAZIONE FIGURE ---");

        for (FiguraGeometrica f : figure) {
            f.visualizza();
            System.out.println("----------------------");
        }

        input.close();
    }
}