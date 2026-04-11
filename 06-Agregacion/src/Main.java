package agregacion;

public class Main {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luis");
        Jugador j2 = new Jugador("Pedro");

        Equipos equipos = new Equipos("Tigres");
        equipos.agregarJugador(j1);
        equipos.agregarJugador(j2);

        equipos.mostrarJugadores();
    }
    
}
