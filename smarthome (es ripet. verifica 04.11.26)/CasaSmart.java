import java.util.ArrayList;

public class CasaSmart {

    private ArrayList<Dispositivo> dispositivi;

    public CasaSmart() {
        dispositivi = new ArrayList<>();
    }

    public void aggiungi(Dispositivo d) {
        dispositivi.add(d);
    }

    public void rimuovi(String nome) {
        dispositivi.removeIf(d -> d.getNome().equals(nome));
    }

    public void accendiTutti() {
        for (Dispositivo d : dispositivi) {
            d.accendi();
        }
    }

    public void spegniTutti() {
        for (Dispositivo d : dispositivi) {
            d.spegni();
        }
    }

    public int contaAccesi() {

        int contatore = 0;

        for (Dispositivo d : dispositivi) {
            if (d.isAcceso()) {
                contatore++;
            }
        }

        return contatore;
    }
}