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
public class Test {
    public Test(){};
    public void esegui(){
        Scanner input = new Scanner(System.in);
        System.out.println("inserire il nome della squadra 1: ");
        Squadra s1 = new Squadra(input.nextLine());
        System.out.println("inserire il nome della squadra 2: ");
        Squadra s2 = new Squadra(input.nextLine());
        for (int i = 1; i <= 11; i++){
            System.out.println("inserire il nome del giocatore " + i + ": ");
            
        }
    }
}
