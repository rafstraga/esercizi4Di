import java.util.ArrayList;

public class Azienda {

    private ArrayList<Dipendente> dipendenti;

    public Azienda() {
        dipendenti = new ArrayList<>();
    }

    public void assumi(Dipendente d) {
        dipendenti.add(d);
    }

    public boolean licenzia(String matricola) {
        for (Dipendente d : dipendenti) {
            if (d.getMatricola().equals(matricola)) {
                dipendenti.remove(d);
                return true;
            }
        }
        return false;
    }

    public double costoStipendi() {
        double totale = 0;

        for (Dipendente d : dipendenti) {
            totale += d.calcolaStipendio();
        }

        return totale;
    }

    public double totalePremi() {
        double totale = 0;

        for (Dipendente d : dipendenti) {
            if (d instanceof Premiabile) {
                totale += ((Premiabile) d).calcolaPremio();
            }
        }

        return totale;
    }

    public double totaleIndennita() {
        double totale = 0;

        for (Dipendente d : dipendenti) {
            if (d instanceof Reperibile) {
                totale += ((Reperibile) d).getIndennita();
            }
        }

        return totale;
    }

    public double costoTotale() {
        return costoStipendi() +
                totalePremi() +
                totaleIndennita();
    }

    public Dipendente piuPagato() {

        if (dipendenti.isEmpty()) {
            return null;
        }

        Dipendente max = dipendenti.get(0);

        for (Dipendente d : dipendenti) {
            if (d.calcolaStipendio() >
                    max.calcolaStipendio()) {
                max = d;
            }
        }

        return max;
    }

    public ArrayList<Reperibile> elencoReperibili() {

        ArrayList<Reperibile> lista = new ArrayList<>();

        for (Dipendente d : dipendenti) {
            if (d instanceof Reperibile) {
                lista.add((Reperibile) d);
            }
        }

        return lista;
    }

    public boolean registraStraordinario(
            String matricola, int ore) {

        for (Dipendente d : dipendenti) {

            if (d.getMatricola().equals(matricola)) {

                if (d instanceof Operaio) {

                    Operaio o = (Operaio) d;
                    o.aggiungiStraordinario(ore);

                    return true;
                }

                return false;
            }
        }

        return false;
    }

    public void stampaBustePaga() {

        for (Dipendente d : dipendenti) {
            System.out.println(d);
        }
    }
}