public class Moto extends Veicolo implements Accendibile {

    private boolean acceso;

    public Moto(String marca, String modello, int velocitaMassima) {
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
        return "Moto: " + getMarca() + " " + getModello()
                + " - Velocità massima: " + getVelocitaMassima() + " km/h";
    }
}