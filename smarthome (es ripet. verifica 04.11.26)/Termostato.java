public class Termostato implements Dispositivo {

    private String nome;
    private boolean acceso;
    private double temperatura;

    public Termostato(String nome, double temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.acceso = false;
    }

    @Override
    public void accendi() {
        acceso = true;
    }

    @Override
    public void spegni() {
        acceso = false;
    }

    @Override
    public boolean isAcceso() {
        return acceso;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
