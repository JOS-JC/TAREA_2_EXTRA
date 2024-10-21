class Noria extends Atraccion implements Mantenimiento {
    private int alturaMaxima; // en metros

    public Noria(String nombre, int capacidadMaxima, int duracion, int alturaMaxima) {
        super(nombre, capacidadMaxima, duracion);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void iniciar() {
        System.out.println("La noria está girando.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la noria.");
    }

    @Override
    public boolean estadoMantenimiento() {
        // Aquí se podría implementar una lógica real
        return false; // Por defecto, no necesita mantenimiento
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
}
