public class Elettronica extends Prodotto implements Scontabile {
    private int mesiGaranzia;
    private boolean scontato;

    public Elettronica(String nome, double prezzo, int mesiGaranzia) {
        super(nome, prezzo);
        this.mesiGaranzia = mesiGaranzia;
        this.scontato = false; // valore iniziale
    }

    @Override
    public void applicaSconto(int percentuale) {
        if (!scontato) {
            double nuovoPrezzo = getPrezzo() * (1 - percentuale / 100.0);
            setPrezzo(nuovoPrezzo);
            scontato = true;
            System.out.println("Successo: Sconto del " + percentuale + "% applicato al prodotto elettronico \"" + getNome() + "\".");
        } else {
            System.out.println("Attenzione: Il prodotto elettronico \"" + getNome() + "\" è già stato scontato in precedenza!");
        }
    }

    @Override
    public boolean isScontato() {
        return scontato;
    }

    @Override
    public String descrizione() {
        return "Elettronica: " + super.descrizione() + ", garanzia di " + mesiGaranzia + " mesi";
    }
}