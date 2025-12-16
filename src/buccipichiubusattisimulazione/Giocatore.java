/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

import java.util.Objects;

/**
 *
 * @author BUSATTI.MATTIA
 */
public class Giocatore {

    protected int forza;
    protected int i;

    public Giocatore(int i) {
        this.i = i;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    

    @Override
    public String toString() {
        return "Giocatore{" + "forza=" + forza + ", maglia=" + i + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Giocatore other = (Giocatore) obj;
        if (this.forza != other.forza) {
            return false;
        }
        return this.i == other.i;
    }

    

    
    
    

}

