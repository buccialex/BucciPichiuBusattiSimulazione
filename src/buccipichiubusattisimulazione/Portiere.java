/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccipichiubusattisimulazione;
import java.util.*;
/**
 *
 * @author BUSATTI.MATTIA
 */
public class Portiere extends Giocatore{

    public Portiere(int i) {
        super(i);
        Random r = new Random();
        forza = r.nextInt(50, 61);
        
    }

    
    
    
}
