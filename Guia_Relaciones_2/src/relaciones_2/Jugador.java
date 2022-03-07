package relaciones_2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    
    //metodos
    
    public ArrayList<Jugador> cargarJugadores() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores, entre 1 y 6");
        int cantJugadores = scanner.nextInt();
        if (cantJugadores < 1 || cantJugadores > 6) {
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i + 1);
            jugador.setMojado(false);
            jugador.setNombre("jugador" + jugador.getId());
            jugadores.add(jugador);
        }
        return jugadores;
    }

    
    public boolean disparo(RevolverDeAgua r){
        if (r.mojar()){
            this.mojado = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", name=" + nombre + ", mojado=" + mojado + '}';
    }

}
