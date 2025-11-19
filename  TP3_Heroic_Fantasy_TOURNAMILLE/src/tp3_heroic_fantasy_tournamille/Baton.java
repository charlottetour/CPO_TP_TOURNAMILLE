/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_tournamille;

/**
 *
 * @author ctour
 */
public class Baton extends Arme {

    int age;

    public Baton(int niveau, String Nom, int age) {
        super(niveau, Nom);
        if (age < 100 && age > 0) {
            this.age = age;
        }
    }

}
