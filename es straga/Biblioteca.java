public class Biblioteca {

    public static void stampaCatalogo(Libro[] catalogo) {
        System.out.println("=== CATALOGO BIBLIOTECA ===");
        for (Libro l : catalogo) {
            if (l != null) {
                l.stampaScheda();
            }
        }
    }

    public static void cercaPerAutore(Libro[] catalogo, String autore) {
        System.out.println("=== LIBRI DI: " + autore + " ===");
        for (Libro l : catalogo) {
            if (l != null && l.getAutore().equalsIgnoreCase(autore)) {
                l.stampaScheda();
            }
        }
    }

    public static void main(String[] args) {
        // Creazione del catalogo (array di Libro)
        Libro[] catalogo = new Libro[3];

        catalogo[0] = new Libro("I Promessi Sposi", "Alessandro Manzoni", 720, 12.5);
        catalogo[1] = new Libro("Il Fu Mattia Pascal", "Luigi Pirandello", 250, 10.0);
        catalogo[2] = new Libro("Uno, nessuno e centomila", "Luigi Pirandello", 180, 9.0);

        // Uso dei metodi statici
        stampaCatalogo(catalogo);
        System.out.println();
        cercaPerAutore(catalogo, "Luigi Pirandello");
    }
}