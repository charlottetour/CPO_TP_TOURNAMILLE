/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_tournamille;

/**
 *
 * @author ctour
 */
public class Epée extends Arme {

    int finesse;

    public Epée(int niveau, String Nom, int finesse) {
        super(niveau, Nom);
        if (finesse < 100 && finesse > 0) {
            this.finesse = finesse;
        }
    }

}
