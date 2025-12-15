/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

import java.util.*;

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
    
    public String simula(){
        Random random = new Random();
        Partita p = new Partita();
        String mess = "";
        Giocatore infortunato;
        Squadra gol;
        for (int i = 1; i <= 90; i++){
            infortunato = p.infortunio();
            if (infortunato != null){
                mess = "infortunio per il giocatore " + infortunato;
                return mess;
            }
           
        }
        
        for (int i = random.nextInt(20); i < 5;){
            gol = p.gol();
            mess = "gol per la squadra " + gol;
            return mess;
        }
        
        Squadra[] squadre = p.getSquadre();
        
        this.setSquadraVincitrice(squadre);
        
        return null;
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
