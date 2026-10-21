public class Main {
    public static void main(String[] args) {

        Automobile auto = new Automobile("Volkswagen", "Tiguan", 230);
        Moto moto = new Moto("Yamaha", "MT-07", 214);
        Bicicletta bici = new Bicicletta("Bianchi", "Sprint", 45);

        System.out.println(auto.descrizione());
        System.out.println(moto.descrizione());
        System.out.println(bici.descrizione());

        auto.accendi();
        moto.accendi();

        System.out.println("\nStato veicoli:");

        System.out.println("Auto accesa? " + auto.isAcceso());
        System.out.println("Moto accesa? " + moto.isAcceso());

        auto.spegni();

        System.out.println("Auto accesa dopo lo spegnimento? "
                + auto.isAcceso());
    }
}