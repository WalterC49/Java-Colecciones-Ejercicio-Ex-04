/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicio {
    static Scanner leer = new Scanner(System.in);
    static HashMap<Integer,String> CodigosPostales = new HashMap();
    
    public static void Agregar10CodigosPostales(){
        int cod;
        String nombre;
        for(int i=0;i<10;i++){
            System.out.print("\nIngrese el "+(i+1)+"º código postal: ");
            cod=leer.nextInt();
            leer.nextLine();
            System.out.print("Ingrese el nombre de la "+(i+1)+"º ciudad: ");
            nombre=leer.nextLine();
            CodigosPostales.put(cod, nombre);
        }
        
    }
    
    public static void MostrarCodigosPostales(){
        System.out.println("\nCódigos Postales:");
        for(Map.Entry<Integer,String> entry:CodigosPostales.entrySet()){
            System.out.println("\nCódigo postal: "+entry.getKey()+" - "+"Ciudad: "+entry.getValue());
        }
    }
    
    public static void BuscarCodigoPostal(){
        int buscar;
        boolean encontrado=false;
        System.out.print("\nIngrese un código postal para mostrar su ciudad asociada: ");
        buscar=leer.nextInt();
        for(Integer i:CodigosPostales.keySet()){
            if(i==buscar){
                System.out.println("La ciudad asociada a ese código es: "+CodigosPostales.get(i));
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró una ciudad asociada al código "+buscar+".");
        }
    }
    
    public static void AgregarCodigoPostal(){
        int cod;
        String nombre;
        System.out.println("\nSe agregará otro código con su ciudad correspondiente.");
        System.out.print("Ingrese un código postal: ");
        cod=leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese el nombre de la ciudad: ");
        nombre=leer.nextLine();
        CodigosPostales.put(cod, nombre);
    }
    
    public static void Eliminar3Ciudades(){
        String[] buscar = new String[3];
        System.out.println("\nSe eliminarán 3 ciudades.");
        for(int i=0;i<3;i++){
            System.out.print("Ingrese el nombre de la "+(i+1)+"º ciudad: ");
            buscar[i]=leer.nextLine();
        }
        
        Iterator<Map.Entry<Integer,String>> it = CodigosPostales.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            for(int i=0;i<3;i++){
                if(entry.getValue().equals(buscar[i])){
                    it.remove();
                }    
            }
        }
    }
    
}
