public class Bicicletta extends Veicolo {

    public Bicicletta(String marca, String modello, int velocitaMassima) {
        super(marca, modello, velocitaMassima);
    }

    @Override
    public String descrizione() {
        return "Bicicletta: " + getMarca() + " " + getModello()
                + " - Velocità massima: " + getVelocitaMassima() + " km/h";
    }
}