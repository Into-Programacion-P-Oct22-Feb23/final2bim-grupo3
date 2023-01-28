/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class funciones {

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        String ciudad;
        String pais;
        String correo;
        String mensaje = "";

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo:");
        correo = entrada.nextLine();

        mensaje = String.format("%sNombre de usuario: %s\nEdad: %d\nCiudad:%s\n"
                + "Pais: %s\nCorreo Electronico: %s\n", mensaje, nombre,
                edad, ciudad, pais, correo);
        
       
        return mensaje;

    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        int numeroCelular;
        int edad;
        String mensaje = "";
        String nombreUsuario;
        String ciudad;
        String pais;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        numeroCelular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();

        mensaje = String.format("%sNombre de usuario: %s\n Numero de celular: %d\n"
                + "Edad: %d\n Ciudad: %s\nPaís: %s", mensaje,
                nombreUsuario, numeroCelular,
                edad, ciudad, pais);
        return mensaje;
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        int numeroCelular;
        int edad;
        String mensaje = "";
        String nombreUsuario;
        String ciudad;
        String pais;
        String hobby;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        numeroCelular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal:");
        hobby = entrada.nextLine();

        mensaje = String.format("%sNombre de usuario: %s\nNumero de celular: %d\n"
                + "Edad: %d\nCiudad: %s\nPais: %s\nHobby principal: %s\n",
                mensaje, nombreUsuario, numeroCelular,
                edad, ciudad, pais, hobby);
        return mensaje;

    }
    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String correo;
        String nombreUsuario;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("%sNombre de usuario: %s\nCorreo electronico: "
                + "%s\n", mensaje, nombreUsuario, correo);
        
        return mensaje;
    }

}
