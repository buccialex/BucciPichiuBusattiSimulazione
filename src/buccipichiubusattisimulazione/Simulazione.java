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

    public Simulazione(){}

    public Squadra getSquadraVincitrice() {
        return squadraVincitrice;
    }

    public void setSquadraVincitrice(Squadra[] squadre) {
        if (squadre[0].getnGol() > squadre[1].getnGol()){
            squadraVincitrice = squadre[0];
        } else if (squadre[1].getnGol() > squadre[0].getnGol()){
            squadraVincitrice = squadre[1];
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
