class FiguraGeometrica {
    protected String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public double area() {
        return 0;
    }

    public void visualizza() {
        System.out.println("Nome figura: " + nome);
    }
}
