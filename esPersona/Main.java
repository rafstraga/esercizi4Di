public class Main {
    public static void main(String[] args) {
        // Creazione degli oggetti
        Persona p = new Persona("Mario", 30);
        Studente s = new Studente("Luca", 17, "I.T.T. \"Luigi dell'Erba\"");

        System.out.println("--- Test metodo presentati() ---");
        p.presentati();
        s.presentati(); // Esegue la versione ridefinita per lo Studente

        System.out.println("\n--- Test metodo presentati(destinatario) ---");
        p.presentati("Francesco");
        s.presentati("Professore"); 
        
    }
}