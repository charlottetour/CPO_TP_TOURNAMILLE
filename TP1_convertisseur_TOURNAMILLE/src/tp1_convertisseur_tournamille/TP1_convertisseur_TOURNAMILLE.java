/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_tournamille;
import java.util.Scanner ; 
/**
 *
 * @author ctour
 */
public class TP1_convertisseur_TOURNAMILLE {

    /**
     * param args the command line arguments
     */
    public static double CelciusVersKelvin(double tCelcius) {
        double kelvin = tCelcius + 273.15;
        return kelvin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisissez une temperature en Celsius : ");
        double tCelsius = sc.nextDouble();

        double tKelvin = CelciusVersKelvin(tCelsius);
        System.out.println("Voici la temperature en Kelvin : " + tKelvin);
    }
}
