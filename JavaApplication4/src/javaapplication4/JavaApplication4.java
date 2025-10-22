/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author ctour
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" saisissez deux entiers ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" saisissez le premier : ");
        int entier1 = sc.nextInt();
        System.out.println(" saisissez le deuxieme : ");
        int entier2 = sc.nextInt();
        System.out.println(" voici la somme: ");
        int result ;
        result = entier1 + entier2 ;
        System.out.println(result);
        
        System.out.println(" voici la difference: ");
        int result2 ;
        result2 = entier1 - entier2 ;
        System.out.println(result2);
        
        System.out.println(" voici leur produit: ");
        int result3 ;
        result3 = entier1 + entier2 ;
        System.out.println(result3);
        
        
        
    }

}
