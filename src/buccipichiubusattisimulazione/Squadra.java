/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

/**
 *
 * @author pichiu.florin
 */
public class Squadra {

    private Giocatore[] formazioneGiocatori;
    private int forzaTot;

    public Squadra() {
    }

    public void aggiungiGiocatore(Giocatore giocatore, int i) {
        formazioneGiocatori[i] = giocatore;
    }

    public void calcolaForzaTot() {
        for (Giocatore giocatore : formazioneGiocatori) {
            forzaTot += giocatore.getForza();
        }
    }

    public Giocatore[] getFormazioneGiocatori() {
        return formazioneGiocatori;
    }

    public void setFormazioneGiocatori(Giocatore[] formazioneGiocatori) {
        this.formazioneGiocatori = formazioneGiocatori;
    }

    public int getForzaTot() {
        return forzaTot;
    }

    public void setForzaTot(int forzaTot) {
        this.forzaTot = forzaTot;
    }

}
