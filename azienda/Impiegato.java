public class Impiegato extends Dipendente implements Premiabile {

    private int livello;

    public Impiegato(String matricola, String nome,
                     double stipendioBase, int livello) {
        super(matricola, nome, stipendioBase);
        this.livello = livello;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendioBase() + livello * 100;
    }

    @Override
    public double calcolaPremio() {
        return calcolaStipendio() * 0.05;
    }

    @Override
    public String getRuolo() {
        return "Impiegato";
    }
}