/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

import java.util.Objects;

/**
 *
 * @author bucci.alex
 */
public class Simulazione {
    private Squadra squadraVincitrice;

    

    public Squadra getSquadraVincitrice() {
        return squadraVincitrice;
    }

    public void setSquadraVincitrice(Squadra squadraVincitrice) {
        this.squadraVincitrice = squadraVincitrice;
    }
    
    public void simula(){
        for(int i = 1; i <= 90; i++){
            // cose che possono succedere ogni minuto della partita
        }
    }

    @Override
    public String toString() {
        return "Simulazione{" + "squadraVincitrice=" + squadraVincitrice + '}';
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
        final Simulazione other = (Simulazione) obj;
        return Objects.equals(this.squadraVincitrice, other.squadraVincitrice);
    }
    
    
        
}
