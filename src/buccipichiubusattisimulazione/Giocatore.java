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
    protected String nome;

    public Giocatore() {
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

    @Override
    public String toString() {
        return "Giocatore{" + "forza=" + forza + ", nome=" + nome + '}';
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
        return Objects.equals(this.nome, other.nome);
    }
    
    

}

