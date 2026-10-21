public abstract class Veicolo {
    private String marca;
    private String modello;
    private int velocitaMassima;

    public Veicolo(String marca, String modello, int velocitaMassima) {
        this.marca = marca;
        this.modello = modello;
        this.velocitaMassima = velocitaMassima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    public abstract String descrizione();
}