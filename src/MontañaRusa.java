class MontañaRusa extends Atraccion implements Mantenimiento {
    private String intensidad; // Ejemplo: "Baja", "Media", "Alta"

    public MontañaRusa(String nombre, int capacidadMaxima, int duracion, String intensidad) {
        super(nombre, capacidadMaxima, duracion);
        this.intensidad = intensidad;
    }

    @Override
    public void iniciar() {
        System.out.println("La montaña rusa está en marcha.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la montaña rusa.");
    }

    @Override
    public boolean estadoMantenimiento() {
        // Aquí se podría implementar una lógica real
        return false; // Por defecto, no necesita mantenimiento
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public void aumentarIntensidad() {
        // Ejemplo de incremento simple, puedes mejorar la lógica
        if (intensidad.equals("Baja")) {
            intensidad = "Media";
        } else if (intensidad.equals("Media")) {
            intensidad = "Alta";
        }
        System.out.println("Intensidad aumentada a: " + intensidad);
    }
}
