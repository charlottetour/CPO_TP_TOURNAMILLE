/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_tournamille;

/**
 *
 * @author ctour
 */
public class TP2_Bieres_TOURNAMILLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;  
        System.out.println(uneBiere) ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        
        BouteilleBiere Leffe = new BouteilleBiere("Leffe", 
6.6 ,"Abbaye de Leffe") ; 
        Leffe.lireEtiquette();
        Leffe.Décapsuler();
        
    }
    
}
