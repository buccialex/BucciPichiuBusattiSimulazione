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

    public Partita(Squadra[] squadre) {
        squadre = new Squadra[2];
        Random r = new Random();
    }

    public Squadra[] getSquadre() {
        return squadre;
    }

    public void setSquadre(Squadra[] squadre) {
        this.squadre = squadre;
    }

    public void infortunio() {
        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            Giocatore[] formazione = squadre[r.nextInt(i)].getFormazioneGiocatori();
            for (Giocatore g : formazione) {
                if (r.nextInt(5) == 1) {
                    g.setForza(g.getForza() - 20);
                }
            }

        }

    }

}
