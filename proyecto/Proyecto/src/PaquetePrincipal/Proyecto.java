/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PaquetePrincipal;

import java.util.Locale;
import java.util.Scanner;
import paquete01.funciones;
import paquete02.procedimientos;
import paquete03.Mensaje;

/**
 *
 * @author Usuario iTC
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        int opcionDos;
        int contador = 0;
        boolean bandera = true;
        String mensaje = "";

        while (bandera == true) {
            contador = contador + 1;
            System.out.println("Ingrese 1 para crear una cuenta en Facebook\n"
                    + "Ingrese 2 para crear una cuenta en Twitter\nIngrese 3 para "
                    + "crear una cuenta en Whatsapp\nIngrese 4 para crear una cuenta"
                    + "de Telegram\nIngrese 5 para crear una cuenta en Signal\n"
                    + "Ingrese 6 para crear una cuenta en Instagram\nIngrese 7 para"
                    + "crear una cuenta en en Flick\n");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                mensaje = funciones.crearFacebook();
                System.out.println(mensaje);
            } else {
                if (opcion == 2) {
                    procedimientos.crearTwitter();
                } else {
                    if (opcion == 3) {
                        mensaje = funciones.crearWhatsapp();
                        System.out.println(mensaje);
                    } else {
                        if (opcion == 4) {
                            procedimientos.crearTelegram();
                        } else {
                            if (opcion == 5) {
                                mensaje = funciones.crearSignal();
                                System.out.println(mensaje);
                            } else {
                                if (opcion == 6) {
                                    procedimientos.crearInstagram();
                                } else {
                                    if (opcion == 7) {
                                        mensaje = funciones.crearFlickr();
                                        System.out.println(mensaje);
                                    } else {
                                        System.out.println("Error en la "
                                                + "opcion seleccionada");
                                        contador = 0;
                                    }
                                }
                            }
                        }
                    }
                }

            }
            System.out.println("Ingrese 9 para salir");
            opcionDos = entrada.nextInt();
            
            if (opcionDos == 9) {
                bandera = false;
                
                if (contador > 0) {
                    mensaje = Mensaje.obtenerMensaje(contador);
                    System.out.printf("Con número de cuentas %d es: %s",
                            contador, mensaje);
                }
            }

        }
    }
}
