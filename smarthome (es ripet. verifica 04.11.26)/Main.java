public class Main {

    public static void main(String[] args) {

        CasaSmart casa = new CasaSmart();

        Lampada lampada1 = new Lampada("Salotto", 80);
        Lampada lampada2 = new Lampada("Camera", 60);
        Termostato termostato = new Termostato("Termostato", 22.5);

        casa.aggiungi(lampada1);
        casa.aggiungi(lampada2);
        casa.aggiungi(termostato);

        lampada1.accendi();
        termostato.accendi();

        System.out.println("Dispositivi accesi: " +
                casa.contaAccesi());
    }
}