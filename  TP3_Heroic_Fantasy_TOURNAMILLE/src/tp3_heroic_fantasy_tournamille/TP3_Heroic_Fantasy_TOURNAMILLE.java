/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_tournamille;

import java.util.ArrayList;

/**
 *
 * @author ctour
 */
public class TP3_Heroic_Fantasy_TOURNAMILLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epée e1 = new Epée(7, "Excalibur", 5);
        Epée e2 = new Epée(4, "Durandal", 7);
        Baton b1 = new Baton(4, "Chêne", 5);
        Baton b2 = new Baton(5, "Charme", 6);

        ArrayList<String> TabArme = new ArrayList<String>();
        TabArme.add("Epée e1");
        TabArme.add("Epée e2");
        TabArme.add("Baton b1");
        TabArme.add("Baton b2");
        
        int taille = TabArme.size();

System.out.print("[");

for (int i = 0; i < taille; i++) {
    System.out.print(TabArme.get(i));
    
    if (i < taille - 1) {
        System.out.print(", "); 
    }
}

System.out.print("]");
    }

}
