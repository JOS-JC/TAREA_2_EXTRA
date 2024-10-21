//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las atracciones
        MontañaRusa montañaRusa = new MontañaRusa("Montaña Rusa X", 20, 3, "Baja");
        Noria noria = new Noria("Noria Gigante", 15, 5, 30);
        AutitosChocadores autitosChocadores = new AutitosChocadores("Autitos Chocadores", 10, 4, 8);

        // Probar métodos en Montaña Rusa
        montañaRusa.iniciar();
        montañaRusa.aumentarIntensidad();
        montañaRusa.detener();
        montañaRusa.realizarMantenimiento();
        System.out.println("¿La montaña rusa necesita mantenimiento? " + montañaRusa.estadoMantenimiento());

        System.out.println();

        // Probar métodos en Noria
        noria.iniciar();
        noria.detener();
        noria.realizarMantenimiento();
        System.out.println("¿La noria necesita mantenimiento? " + noria.estadoMantenimiento());

        System.out.println();

        // Probar métodos en Autitos Chocadores
        autitosChocadores.iniciar();
        autitosChocadores.detener();
        autitosChocadores.realizarMantenimiento();
        System.out.println("¿Los autitos chocadores necesitan mantenimiento? " + autitosChocadores.estadoMantenimiento());

        // Probar la sobrecarga de iniciar en Autitos Chocadores
        autitosChocadores.iniciar(5); // Iniciar con 5 autitos
    }
}