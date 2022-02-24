package relaciones_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class BarajaService {

    Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Carta> mazo = new ArrayList<>();
    private ArrayList<Carta> mazoAux = new ArrayList<>();
    Carta carta;

    public void crearBaraja() {
        mazoAux.clear();
        for (int i = 0; i < 13; i++) {
            if (i > 0 && i < 8 || i > 9 && i < 13) {
                carta = new Carta(i, "espada");
                mazo.add(carta);
                carta = new Carta(i, "basto");
                mazo.add(carta);
                carta = new Carta(i, "oro");
                mazo.add(carta);
                carta = new Carta(i, "copa");
                mazo.add(carta);
            }
            System.out.println(mazo);
        }
    }

    public void mezclarCartas() {
        System.out.println("Cartas mezcladas");
        Collections.shuffle(mazo);
    }

    public void siguienteCarta() {
        if (!mazo.isEmpty()) {
            Iterator<Carta> it = mazo.iterator();
            Carta sacar = it.next();
            System.out.println("La carta sacada es " + sacar);
            mazoAux.add(sacar);
            it.remove();
        } else {
            System.out.println("El mazo está vacío");
        }
    }

    public void darCartas(int nSacar) {
        if (!mazo.isEmpty()) {
            if (nSacar <= mazo.size()) {
                Iterator<Carta> it = mazo.iterator();
                for (int i = 0; i < nSacar; i++) {
                    Carta sacar = it.next();
                    System.out.println("La carta sacada es " + sacar);
                    mazoAux.add(sacar);
                    it.remove();
                }
            } else {
                System.out.println("La cantidad a sacar es mayor a la que hay en el mazo");
            }
        } else {
            System.out.println("El mazo está vacío");
        }

    }

    public void cartasDisponibles() {
        System.out.printf("Las cartas restantes en el mazo son %d'\n", mazo.size());
        System.out.printf("La cantidad de cartas sacadas del mazo fueron %d\n", mazoAux.size());
    }

    public void cartasMonton() {
        System.out.println("Las cartas extraidas son:");
        if (!mazoAux.isEmpty()) {
            for (Carta carta : mazoAux) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se han extraído cartas");
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("");
        if(!mazo.isEmpty()){
            for (Carta carta : mazo) {
                System.out.println(carta);
            }
        }
        
    }

    public void menu() {
        int opciones, nSacar;
        boolean band = false;
        do{
        System.out.println("---MENU---");
        System.out.println("1-Crear Baraja");
        System.out.println("2-Mezclar cartas");
        System.out.println("3-Sacar carta");
        System.out.println("6-Repartir cartas");
        System.out.println("5-Cartas disponibles en el mazo");
        System.out.println("6-Ver cartas repartidas");
        System.out.println("7-Mostrar baraja");
        System.out.println("8-SALIR");

        opciones = scanner.nextInt();
        switch (opciones) {
            case 1:
                System.out.println("Baraja creada!");
                crearBaraja();
                break;
            case 2:
                mezclarCartas();
                break;
            case 3:
                siguienteCarta();
                break;
            case 4:
                System.out.println("Ingrese las cartas a sacar:");
                nSacar = scanner.nextInt();
                darCartas(nSacar);
                break;
            case 5:
                cartasDisponibles();
                break;
            case 6:
                cartasMonton();
                break;
            case 7:
                mostrarBaraja();
                break;
            case 8:
                System.out.println("Adiós!");
            default:
                System.out.println("Ingrese una opción correcta");
        }
            
        }while(opciones !=8);
    }

}
