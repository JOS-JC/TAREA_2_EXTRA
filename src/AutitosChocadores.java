class AutitosChocadores extends Atraccion implements Mantenimiento {
    private int numeroDeAutitos;

    public AutitosChocadores(String nombre, int capacidadMaxima, int duracion, int numeroDeAutitos) {
        super(nombre, capacidadMaxima, duracion);
        this.numeroDeAutitos = numeroDeAutitos;
    }

    @Override
    public void iniciar() {
        System.out.println("Los autitos chocadores están en marcha.");
    }

    public void iniciar(int numeroAutitos) {
        System.out.println("Los autitos chocadores están en marcha con " + numeroAutitos + " autitos.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en los autitos chocadores.");
    }

    @Override
    public boolean estadoMantenimiento() {
        // Aquí se podría implementar una lógica real
        return false; // Por defecto, no necesita mantenimiento
    }

    public int getNumeroDeAutitos() {
        return numeroDeAutitos;
    }

    public void setNumeroDeAutitos(int numeroDeAutitos) {
        this.numeroDeAutitos = numeroDeAutitos;
    }
}
