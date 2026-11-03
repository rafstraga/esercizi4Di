public abstract class Dipendente {
    private String matricola;
    private String nome;
    private double stipendioBase;

    public Dipendente(String matricola, String nome, double stipendioBase) {
        this.matricola = matricola;
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public abstract double calcolaStipendio();

    public abstract String getRuolo();

    @Override
    public String toString() {
        return getRuolo() + " - " +
                matricola + " - " +
                nome + " - Stipendio: " +
                calcolaStipendio();
    }
}