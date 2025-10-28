/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author ctour
 */
public class TP0_Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2. Afficher le menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // 3. Récupérer le choix de l’opérateur
        int operateur = sc.nextInt();

        // 4. Demander et récupérer le premier opérande
        System.out.println("Enter the first operand:");
        int operande1 = sc.nextInt();

        // 5. Demander et récupérer le second opérande
        System.out.println("Enter the second operand:");
        int operande2 = sc.nextInt();

        int resultat = 0; // variable pour stocker le résultat

        // 6. Calculer le résultat en fonction de l’opérateur
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                System.out.println("Result: " + resultat);
                break;
            case 2:
                resultat = operande1 - operande2;
                System.out.println("Result: " + resultat);
                break;
            case 3:
                resultat = operande1 * operande2;
                System.out.println("Result: " + resultat);
                break;
            case 4:
                if (operande2 != 0) {
                    double resDiv = (double) operande1 / operande2;
                    System.out.println("Result: " + resDiv);
                } else {
                    System.out.println("Error: division by zero!");
                }
                break;
            case 5:
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                    System.out.println("Result: " + resultat);
                } else {
                    System.out.println("Error: modulo by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator selected!");
                break;
        }

        sc.close();
    }
}
