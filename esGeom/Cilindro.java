class Cilindro extends Cerchio {
    protected double altezza;

    public Cilindro(String nome, double raggio, double altezza) {
        super(nome, raggio);
        this.altezza = altezza;
    }

    public double superficieLaterale() {
        return circonferenza() * altezza;
    }

    @Override
    public double area() {
        return superficieLaterale() + 2 * super.area();
    }

    public double volume() {
        return super.area() * altezza;
    }

    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Altezza: " + altezza);
        System.out.println("Superficie laterale: " + superficieLaterale());
        System.out.println("Area totale: " + area());
        System.out.println("Volume: " + volume());
    }
}
