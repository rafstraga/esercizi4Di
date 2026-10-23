public class Main {
    public static void main(String[] args) {
        // Creazione dei prodotti richiesti
        Libro libro = new Libro("Il nome della rosa", 20.0, "Umberto Eco");
        Elettronica elettronica = new Elettronica("Cuffie wireless", 80.0, 24);
        Alimento alimento = new Alimento("Pasta integrale", 2.5, true);

        // Inserimento in un array Prodotto[] e stampa iniziale
        Prodotto[] prodotti = { libro, elettronica, alimento };

        System.out.println("=== CATALOGO INIZIALE ===");
        for (Prodotto p : prodotti) {
            System.out.println(p.descrizione());
        }

        // Creazione array Scontabile[] con libro ed elettronica e applicazione sconto 10%
        Scontabile[] scontabili = { libro, elettronica };
        
        System.out.println("\n=== APPLICAZIONE SALDI (10%) ===");
        for (Scontabile s : scontabili) {
            s.applicaSconto(10);
        }

        // Tentativo di applicare un secondo sconto al libro
        System.out.println("\n=== SECONDO TENTATIVO DI SCONTO SUL LIBRO ===");
        libro.applicaSconto(10);

        // Ristampa di tutti i prodotti per verificare i nuovi prezzi
        System.out.println("\n=== CATALOGO AGGIORNATO DOPO I SALDI ===");
        for (Prodotto p : prodotti) {
            System.out.println(p.descrizione());
        }
    }
}