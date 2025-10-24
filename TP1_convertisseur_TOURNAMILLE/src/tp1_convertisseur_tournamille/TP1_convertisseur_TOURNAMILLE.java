/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_tournamille;

import java.util.Scanner;

/**
 *
 * @author ctour
 */
public class TP1_convertisseur_TOURNAMILLE {

    // Méthode qui convertit Celsius -> Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double FarenheitVersCelcius(double FVC) {
        return FVC + 273.15;
    }

    public static double CelciusVersFarenheit(double CVF) {
        return CVF + 273.15;
    }

    public static double KelvinVersFarenheit(double KVF) {
        return KVF + 273.15;
    }

    public static double FarennheitVersKelvin(double FVK) {
        return FVK + 273.15;
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez une temperature en Celsius : ");
        System.out.println("Vous avez saisi : " + temperature + " degres C");
        double temperature = sc.nextDouble();
        System.out.println(temperature);
        System.out.println("Quelle convertion souhaitez-vous faire ? :\n 1) Farenheit vers Celsius \n 2) celsius vers Farenheit \n 3) Kelvin vers Farenheit \n 4) Farenheit vers Kelvin \n ");

        double tKelvin = CelciusVersKelvin(tCelcius);
        System.out.println("La temperature en Kelvin est : " + tKelvin + " K");
    }
}
