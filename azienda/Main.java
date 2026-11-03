public class Main {

    public static void main(String[] args) {

        Azienda a = new Azienda();

        Impiegato i1 =
                new Impiegato("I01",
                        "Marco", 1500, 3);

        Impiegato i2 =
                new Impiegato("I02",
                        "Luca", 1600, 4);

        Operaio o1 =
                new Operaio("O01",
                        "Gianni", 1300);

        Operaio o2 =
                new Operaio("O02",
                        "Paolo", 1400);

        Dirigente d1 =
                new Dirigente("D01",
                        "Anna", 3000,
                        5, 1000);

        Stagista s1 =
                new Stagista("S01",
                        "Michele", 0);

        a.assumi(i1);
        a.assumi(i2);
        a.assumi(o1);
        a.assumi(o2);
        a.assumi(d1);
        a.assumi(s1);

        o1.aggiungiStraordinario(10);

        o2.aggiungiStraordinario(5, true);

        System.out.println(
                a.registraStraordinario("O01", 8));

        System.out.println(
                a.registraStraordinario("I01", 8));

        a.stampaBustePaga();

        System.out.println("\nCosto stipendi: "
                + a.costoStipendi());

        System.out.println("Totale premi: "
                + a.totalePremi());

        System.out.println("Totale indennita: "
                + a.totaleIndennita());

        System.out.println("Costo totale: "
                + a.costoTotale());

        System.out.println("\nPiu pagato:");
        System.out.println(a.piuPagato());

        Impiegato i =
                new Dirigente("D02",
                        "Mario",
                        3000,
                        5,
                        1000);

        System.out.println(
                i.calcolaStipendio());

        System.out.println(
                i.calcolaPremio());
    }
}