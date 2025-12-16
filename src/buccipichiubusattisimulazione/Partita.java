/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

import buccipichiubusattisimulazione.Squadra;
import java.util.*;

/**
 *
 * @author bucci.alex
 */
public class Partita {

    private Squadra[] squadre;
    

    public Partita() {
        squadre = new Squadra[2];
        
    }

    public Squadra[] getSquadre() {
        return squadre;
    }

    public void setSquadre(Squadra[] squadre) {
        this.squadre = squadre;
    }

 public Giocatore infortunio() {
    Random r = new Random();
    
    // RIMOSSO: Partita p = new Partita(); -> Non creare una nuova partita!
    
    // Ciclo su tutte le squadre presenti nell'array della classe corrente
    for (int i = 0; i < squadre.length; i++) {
        
        // Controllo di sicurezza se una casella dell'array è vuota
        if (squadre[i] == null) continue; 

        // Prendo la formazione della squadra 'i' (non una a caso con r.nextInt)
        Giocatore[] formazione = squadre[i].getFormazioneGiocatori();
        
        // Controllo sicurezza se la formazione è null
        if (formazione == null) continue;

        for (Giocatore g : formazione) {
            if (g != null && r.nextInt(5) == 1) { // Aggiunto check g != null
                g.setForza(g.getForza() - 20);
                
                // Aggiorno la forza totale della squadra corrente
                squadre[i].setForzaTot(); 
                
                return g; // Ritorna il giocatore infortunato ed esce
            }
        }
    }
    return null;
}
    
    public Squadra gol(){
        Random r = new Random();
        int probSquadA = squadre[0].getForzaTot() / this.sommaFTot() * 100;
        if (r.nextInt(100) > probSquadA){
            squadre[1].setGol();
            return squadre[1];
        } else {
            squadre[0].setGol();
            return squadre[0];
        }
        
        
        
            
    }
    
    private int sommaFTot(){
        int sommaFTot = 0;
        for (Squadra s : squadre){
            sommaFTot += s.getForzaTot();
        }
        return sommaFTot;
    }

    @Override
    public String toString() {
        return "Partita{" + "squadre=" + Arrays.toString(squadre) + '}';
    }
    
    
}
