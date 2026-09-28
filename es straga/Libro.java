public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private double prezzo;

    // Costruttore
    public Libro() {}

    // Costruttore con parametri
    public Libro(String titolo, String autore, int numeroPagine, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        setPrezzo(prezzo);
    }

    // --- Getter e Setter ---
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Prezzo non valido.");
        }
    }

    // --- Altri Metodi ---
    public void stampaScheda() {
        System.out.println(titolo + " - " + autore + " - " + numeroPagine + " pagine - " + prezzo + " euro.");
    }

    public void applicaSconto(double percentuale) {
        if (percentuale > 0 && percentuale <= 100) {
            this.prezzo -= this.prezzo * (percentuale / 100.0);
        }
    }

    public boolean isVoluminoso() {
        return this.numeroPagine > 500;
    }
}