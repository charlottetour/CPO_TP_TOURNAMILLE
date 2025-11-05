/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_tournamille;

/**
 *
 * @author ctour
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

        public float CelciusVersKelvin(float tCelsius) {
        float tKelvin = tCelsius + 273.15f;
        nbConversions = nbConversions + 1;   // on incrémente le compteur
        return tKelvin;
    }
            public float KelvinVersCelcius(float tKelvin) {
        float tCelsius = tKelvin - 273.15f;
        nbConversions = nbConversions + 1;   // on incrémente le compteur
        return tCelsius;
    }

                public float FarenheitVersCelcius(float tFarenheit) {
        float tCelsius = (5f*(tFarenheit+32f))/9f;
        nbConversions = nbConversions + 1;   // on incrémente le compteur
        return tCelsius;
    }
                public float CelciusVersFarenheit(float tCelsius) {
        float tFarenheit = (tCelsius * 9f / 5f) + 32f;
        nbConversions++;
        return tFarenheit;
    }
public float FarenheitVersKelvin(float tFarenheit) {
        float tKelvin = (tFarenheit - 32f) * 5f / 9f + 273.15f;
        nbConversions++;
        return tKelvin;
    }
    public float KelvinVersFarenheit(float tKelvin) {
        float tFarenheit = (tKelvin - 273.15f) * 9f / 5f + 32f;
        nbConversions++;
        return tFarenheit;
    }


 

    @Override
        public String toString 
            () { 
return "nb de conversions" + nbConversions;
        }
    }
