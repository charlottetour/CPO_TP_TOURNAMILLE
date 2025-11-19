/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_tournamille;

/**
 *
 * @author ctour
 */
public class Arme {

    String Nom;
    int niveau;

    public Arme(int niveau, String Nom) {
        if (niveau <= 100 && niveau >= 0) {
            this.niveau = niveau;
            this.Nom = Nom;

        } else {
            System.out.println("erreur le nombre saisi doit être compris entre 0 et 100");
        }
    }

    @Override
    public String toString() {
        return "Arme{" + "Nom=" + Nom + ", niveau=" + niveau + '}';
    }

}
