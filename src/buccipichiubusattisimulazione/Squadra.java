/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

import java.util.Arrays;
import java.util.Objects;

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
        int ruoli = 0;
       
        
        for (Giocatore g : formazioneGiocatori){
            for (int i = 0; i < 11; i++){
              if(ruoli < 3){
                  formazioneGiocatori[i] = new Attaccante();
                  ruoli++;
              } 
              if(ruoli > 3 && ruoli < 6){
                  formazioneGiocatori[i] = new Centrocampista();
                  ruoli++;
              }
              
              if (ruoli > 6 && ruoli < 11){
                  formazioneGiocatori[i] = new Difensore();
              }
              
              if (ruoli == 11){
                  formazioneGiocatori[i] = new Portiere();
              }
              
              formazioneGiocatori[i].setI(i);
        }
            
           calcolaForzaTot();
    }
        
    }

    

    public void aggiungiGiocatore(Giocatore giocatore, int i) {
        formazioneGiocatori[i] = giocatore;
        this.calcolaForzaTot();
    }

    private void calcolaForzaTot() {
        this.forzaTot = 0;
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

    public int getnGol() {
        return nGol;
    }

    public void setGol() {
        this.nGol += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    

    @Override
    public String toString() {
        return "Squadra{" + "formazioneGiocatori=" + Arrays.toString(formazioneGiocatori) + ", forzaTot=" + forzaTot + ", nome=" + nome + ", nGol=" + nGol + '}';
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
        final Squadra other = (Squadra) obj;
        if (this.forzaTot != other.forzaTot) {
            return false;
        }
        if (this.nGol != other.nGol) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Arrays.deepEquals(this.formazioneGiocatori, other.formazioneGiocatori);
    }
    
    

}
