/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_3;

/**
 *
 * @author Ferchu
 */
public class Carta {
    
    private int numeroCarta;
    private String palo;

    public Carta() {
    }

    public Carta(int numeroCarta, String palo) {
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numeroCarta=" + numeroCarta + ", palo=" + palo + '}';
    }
    
    
}
