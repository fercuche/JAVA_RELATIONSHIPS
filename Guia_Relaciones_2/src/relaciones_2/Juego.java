package relaciones_2;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
        this.jugadores = new ArrayList();
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> listaJugadores, RevolverDeAgua r) {
        this.jugadores = listaJugadores;
        this.revolver = r;

    }

    public void ronda() {
        System.out.println(jugadores);
        int c = 1;
        boolean band = false;
        do {
            System.out.println("Ronda " + (c++));
            for (Jugador jugador : jugadores) {
                if (jugador.disparo(revolver)) {
                    System.out.println(jugador);
                    System.out.println(revolver);
                    band = true;
                    break;
                }
            }

        } while (!band);
    }
    

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

}
