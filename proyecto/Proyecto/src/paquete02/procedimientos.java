/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class procedimientos {
    
    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombreUsuario;
        String nombre;
        String pais;
        String correo;
        String idioma;
        String apellido;
        String ciudad;
        
        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        
        System.out.printf("Nombre de Usuario: %s\nNombres: %s\nApellidos: "
                + "%s\nEdad: %d\nCiudad: %s\nPais: %s\nIdioma: %s\nCorreo "
                + "Electronico: %s\n", nombreUsuario, nombre,
                apellido, edad, ciudad, pais, idioma, 
                correo);
    }
    
    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        int celular;
        String nombreUsuario;
        String ciudad;
        String pais;
        String interes;
        
        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        celular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su área de interés:");
        interes = entrada.nextLine();
        
        System.out.printf("Nombre de Usuario: %s\nNumero de celular: %d\n "
                + "Edad: %d\nCiudad: %s\nPais: %s\nArea de Interes: %s\n",
                nombreUsuario, celular, edad, ciudad, 
                pais, interes);
    }
    
    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombreUsuario;
        String ciudad;
        String correo;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        
        System.out.printf("Nombre de Usuario: %s\nEdad: %d\nCiudad: %s\n"
                + "Pais: %s\nArea de Interes: %s\n",nombreUsuario, 
                edad, ciudad, correo);
        
    }
    
    
}
