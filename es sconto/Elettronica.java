public class Libro extends Prodotto implements Scontabile {
    private String autore;
    private boolean scontato;

    public Libro(String nome, double prezzo, String autore) {
        super(nome, prezzo);
        this.autore = autore;
        this.scontato = false; // valore iniziale
    }

    @Override
    public void applicaSconto(int percentuale) {
        if (!scontato) {
            double nuovoPrezzo = getPrezzo() * (1 - percentuale / 100.0);
            setPrezzo(nuovoPrezzo);
            scontato = true;
            System.out.println("Successo: Sconto del " + percentuale + "% applicato al libro \"" + getNome() + "\".");
        } else {
            System.out.println("Attenzione: Il libro \"" + getNome() + "\" è già stato scontato in precedenza!");
        }
    }

    @Override
    public boolean isScontato() {
        return scontato;
    }

    @Override
    public String descrizione() {
        return "Libro: " + super.descrizione() + ", autore " + autore;
    }
}
