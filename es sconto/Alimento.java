public class Alimento extends Prodotto {
    private boolean biologico;

    public Alimento(String nome, double prezzo, boolean biologico) {
        super(nome, prezzo);
        this.biologico = biologico;
    }

    @Override
    public String descrizione() {
        String bioStr = biologico ? " - Biologico" : "";
        return "Alimento: " + super.descrizione() + bioStr;
    }
}