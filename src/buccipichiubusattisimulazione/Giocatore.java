/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;

/**
 *
 * @author BUSATTI.MATTIA
 */
public class Giocatore {

    protected int forza;
    protected String nome;

    public Giocatore(int forza, String nome) {
        this.forza = forza;
        this.nome = nome;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

