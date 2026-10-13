class Cerchio extends FiguraGeometrica {
    protected double raggio;

    public Cerchio(String nome, double raggio) {
        super(nome);
        this.raggio = raggio;
    }

    public double circonferenza() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Raggio: " + raggio);
        System.out.println("Circonferenza: " + circonferenza());
        System.out.println("Area: " + area());
    }
}