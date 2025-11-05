/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_tournamille;

import java.util.Scanner;

/**
 *
 * @author ctour
 */
public class TP2_convertisseurObjet_TOURNAMILLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Convertisseur c1 = new Convertisseur();
        float res1 = c1.CelciusVersKelvin(25f);
        System.out.println("25 °C = " + res1 + " K");
        float res2 = c1.CelciusVersFarenheit(10f);
        System.out.println("10 °C = " + res2 + " °F");

        Convertisseur c2 = new Convertisseur();
        float res3 = c2.FarenheitVersCelcius(32f);
        System.out.println("32 °F = " + res3 + " °C");
        float res4 = c2.KelvinVersCelcius(300f);
        System.out.println("300 K = " + res4 + " °C");

        System.out.println("Convertisseur 1 : " + c1);
        System.out.println("Convertisseur 2 : " + c2);

        Scanner sc = new Scanner(System.in);
        Convertisseur convMenu = new Convertisseur();

        int choix = -1;

        while (choix != 0) {
            System.out.println("===== MENU CONVERTISSEUR =====");
            System.out.println("1 - Celsius vers Kelvin");
            System.out.println("2 - Kelvin vers Celsius");
            System.out.println("3 - Fahrenheit vers Celsius");
            System.out.println("4 - Celsius vers Fahrenheit");
            System.out.println("5 - Fahrenheit vers Kelvin");
            System.out.println("6 - Kelvin vers Fahrenheit");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
            } else {
                System.out.print("Entrez la température à convertir : ");
                float tempDepart = sc.nextFloat();
                float tempArrivee;

                switch (choix) {
                    case 1 -> {
                        tempArrivee = convMenu.CelciusVersKelvin(tempDepart);
                        System.out.println(tempDepart + " °C = " + tempArrivee + " K");
                    }
                    case 2 -> {
                        tempArrivee = convMenu.KelvinVersCelcius(tempDepart);
                        System.out.println(tempDepart + " K = " + tempArrivee + " °C");
                    }
                    case 3 -> {
                        tempArrivee = convMenu.FarenheitVersCelcius(tempDepart);
                        System.out.println(tempDepart + " °F = " + tempArrivee + " °C");
                    }
                    case 4 -> {
                        tempArrivee = convMenu.CelciusVersFarenheit(tempDepart);
                        System.out.println(tempDepart + " °C = " + tempArrivee + " °F");
                    }
                    case 5 -> {
                        tempArrivee = convMenu.FarenheitVersKelvin(tempDepart);
                        System.out.println(tempDepart + " °F = " + tempArrivee + " K");
                    }
                    case 6 -> {
                        tempArrivee = convMenu.KelvinVersFarenheit(tempDepart);
                        System.out.println(tempDepart + " K = " + tempArrivee + " °F");
                    }
                    default ->
                        System.out.println("Choix invalide !");
                }

                System.out.println("Conversions effectuées par ce convertisseur : " + convMenu);
                System.out.println(); 
            }
        }

        sc.close();
    }
}
