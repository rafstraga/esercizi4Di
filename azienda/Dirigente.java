public class Dirigente extends Impiegato implements Reperibile {

    private double bonus;

    public Dirigente(String matricola, String nome,
                     double stipendioBase,
                     int livello,
                     double bonus) {

        super(matricola, nome, stipendioBase, livello);
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return super.calcolaStipendio() + bonus;
    }

    @Override
    public double calcolaPremio() {
        return calcolaStipendio() * 0.10;
    }

    @Override
    public double getIndennita() {
        return 400;
    }

    @Override
    public String getRuolo() {
        return "Dirigente";
    }
}