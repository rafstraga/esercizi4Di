public class Automobile extends Veicolo implements Accendibile {

    private boolean acceso;

    public Automobile(String marca, String modello, int velocitaMassima) {
        super(marca, modello, velocitaMassima);
        acceso = false;
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
    public String descrizione() {
        return "Automobile: " + getMarca() + " " + getModello()
                + " - Velocità massima: " + getVelocitaMassima() + " km/h";
    }
}