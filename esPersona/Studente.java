public class Studente extends Persona {
    protected String scuola;

    // Costruttore che richiama la superclasse
    public Studente(String nome, int eta, String scuola) {
        super(nome, eta);
        this.scuola = scuola;
    }

    // Ridefinizione (overriding) del metodo presentati()
    @Override
    public void presentati() {
        super.presentati(); // Stampa la parte della persona
        System.out.println("Frequento la scuola " + scuola);
    }
}