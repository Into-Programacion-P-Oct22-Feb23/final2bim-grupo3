/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Usuario iTC
 */
public class Mensaje {
    public static String obtenerMensaje(int contador) {
        String[] mensajeFinal = {"Campaña con poca afluencia\n",
            "Campaña moderada siga adelante\n", "Excelente campaña\n"};
        
        if (contador >= 1 && contador <= 5) {
            return mensajeFinal[0];
        } else if (contador >= 6 && contador <= 15) {
            return mensajeFinal[1];
        } else if (contador >= 16) {
            return mensajeFinal[2];
        }
        return "Error, no hay datos\n";
    }
    
}
