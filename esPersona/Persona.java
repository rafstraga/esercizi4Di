public class Persona {
    protected String nome;
    protected int eta;

    // Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Primo metodo presentati()
    public void presentati() {
        System.out.println("Ciao, sono " + nome + " e ho " + eta + " anni");
    }

    // Secondo metodo presentati(String destinatario)
    public void presentati(String destinatario) {
        System.out.println("Ciao " + destinatario + ", sono " + nome + " e ho " + eta + " anni");
    }
}