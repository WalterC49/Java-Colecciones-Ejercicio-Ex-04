/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
*/
package ejercicio_ex_04;

import Servicios.Servicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa guarda 10 códigos postales con sus ciudades asociadas.");
        Servicio.Agregar10CodigosPostales();
        Servicio.MostrarCodigosPostales();
        Servicio.BuscarCodigoPostal();
        Servicio.MostrarCodigosPostales();
        Servicio.AgregarCodigoPostal();
        Servicio.Eliminar3Ciudades();
        Servicio.MostrarCodigosPostales();
    }
    
}
