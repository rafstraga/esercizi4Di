public class Operaio extends Dipendente implements Reperibile {

    private int oreStraordinario;

    public Operaio(String matricola, String nome,
                   double stipendioBase) {
        super(matricola, nome, stipendioBase);
        oreStraordinario = 0;
    }

    public void aggiungiStraordinario(int ore) {
        oreStraordinario += ore;
    }

    public void aggiungiStraordinario(int ore, boolean festivo) {
        if (festivo) {
            oreStraordinario += ore * 2;
        } else {
            oreStraordinario += ore;
        }
    }

    @Override
    public double calcolaStipendio() {
        return getStipendioBase() + oreStraordinario * 15;
    }

    @Override
    public double getIndennita() {
        return 200;
    }

    @Override
    public String getRuolo() {
        return "Operaio";
    }
}