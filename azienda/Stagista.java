public class Stagista extends Dipendente {

    public Stagista(String matricola, String nome,
                    double stipendioBase) {
        super(matricola, nome, stipendioBase);
    }

    @Override
    public double calcolaStipendio() {
        return 600;
    }

    @Override
    public String getRuolo() {
        return "Stagista";
    }
}