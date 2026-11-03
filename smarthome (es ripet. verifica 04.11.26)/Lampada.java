public class Lampada implements Dispositivo {

    private String nome;
    private boolean acceso;
    private int luminosita;

    public Lampada(String nome, int luminosita) {
        this.nome = nome;
        this.luminosita = luminosita;
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

    public int getLuminosita() {
        return luminosita;
    }
}