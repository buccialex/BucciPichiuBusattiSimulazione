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
    private String nome;
    private int nGol;

    public Squadra(String nome){
        this.nome = nome;
        formazioneGiocatori = new Giocatore[11];
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

    public void setForzaTot() {
        for (Giocatore g : formazioneGiocatori){
            this.forzaTot += g.getForza();
        }
    }

}
