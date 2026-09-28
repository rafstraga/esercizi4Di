public class Main {
    public static void main(String[] args) {
        // 1. Crea due oggetti Libro e imposta gli attributi con i setter
        Libro libro1 = new Libro();
        libro1.setTitolo("I Promessi Sposi");
        libro1.setAutore("Alessandro Manzoni");
        libro1.setNumeroPagine(720);
        libro1.setPrezzo(12.5);

        Libro libro2 = new Libro();
        libro2.setTitolo("Il Fu Mattia Pascal");
        libro2.setAutore("Luigi Pirandello");
        libro2.setNumeroPagine(250);
        libro2.setPrezzo(10.0);

        // 2. Stampa la scheda di entrambi
        System.out.println("--- Schede Libri ---");
        libro1.stampaScheda();
        libro2.stampaScheda();

        // 3. Prova ad impostare un prezzo negativo su uno dei due
        System.out.println("\n--- Prova prezzo negativo ---");
        libro2.setPrezzo(-5.0);

        // 4. Applica uno sconto del 20% al primo libro e stampa il nuovo prezzo
        System.out.println("\n--- Sconto primo libro ---");
        libro1.applicaSconto(20);
        System.out.println("Nuovo prezzo di " + libro1.getTitolo() + ": " + libro1.getPrezzo() + " euro");

        // 5. Stampa per ciascun libro se è voluminoso o meno
        System.out.println("\n--- Verifica Voluminosità ---");
        System.out.println(libro1.getTitolo() + " è voluminoso? " + libro1.isVoluminoso());
        System.out.println(libro2.getTitolo() + " è voluminoso? " + libro2.isVoluminoso());
    }
}