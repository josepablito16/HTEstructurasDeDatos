/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6estructuras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jose
 */
public class HT6Estructuras {

    
    private static Scanner teclado;

	public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String linea;
        //File archivo = new File ("./cards_desc.txt");
        File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT6\\HTEstructurasDeDatos\\cards_desc.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        Factory factory=new Factory();
        
        System.out.println("Ingrese la opcion dependiendo de la implementacion"+"\n"
                + "que quiere hacer");
        
        
        ArrayList<Carta> usuario=new ArrayList<Carta>();
        
        teclado = new Scanner(System.in);
        String x="hola";
            System.out.println(x.indexOf("o"));//devuelve 1
        
        while (true)
        {
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.println("4. Salir");
            
            System.out.print("\n  Ingrese la Opcion: ");
            String tipo=teclado.nextLine();
            
            if (tipo.equals("4")) 
            {
                System.out.println("Saliendo...");
                break;                
            }
            
            
            
            if ((tipo.equals("1"))|| (tipo.equals("2"))||(tipo.equals("3")))
            {
                //
                String nombre="";
                String contenido="";
                Map m=factory.getMap(tipo);
                while( (linea=br.readLine())!=null)
                {
                    nombre=linea.substring(0,linea.indexOf("|"));
                    contenido=linea.substring(linea.indexOf("|")+1,linea.length());
                    
                    m.put(nombre,contenido);
                    
                }
                
                while(true)
                {
                    System.out.println("Ingrese una opcion");
                    System.out.println("1. Agregar carta a la coleccion del usuario");
                    System.out.println("2. Mostrar el tipo de carta especifica");
                    System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta de la coleccion del usuario");
                    System.out.println("4. Mostrar nombre, tipo y cantidad de cada carta que el usuario tiene. Ordenada por tipo");
                    System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
                    System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
                    System.out.println("7. Salir");
                    
                    System.out.print("\n  Ingrese la Opcion: ");
                    tipo=teclado.nextLine();
                    
                    if (tipo.equals("7")) 
                    {
                        System.out.println("Saliendo...");
                        break;
                        
                    }
                     
                     if (tipo.equals("1")) 
                     {
                         System.out.print("\n  Ingrese el nombre de la carta que desea agregar: ");
                         tipo=teclado.nextLine();
                         String carta=(String)m.get(tipo);
                         
                         if (carta==null) 
                         {
                             System.out.println("No existe la carta!");
                             
                         }
                         else
                         {
                             Carta c=new Carta(tipo, carta);
                             usuario.add(c);
                             
                         }
                         
                     }
                     
                     if (tipo.equals("2")) 
                     {
                         System.out.print("\n  Ingrese el nombre de la carta para saber su tipo: ");
                         tipo=teclado.nextLine();
                         String carta=(String)m.get(tipo);
                         
                         if (carta==null) 
                         {
                             System.out.println("No existe la carta!");
                             
                         }
                         else
                         {
                             System.out.println("El tipo de carta es: "+carta);
                             
                         }
                         
                     }
                     
                     if (tipo.equals("3")) 
                     {
                         int mouns=0;
                         int tramp=0;
                         int hechi=0;
                         for(Carta i:usuario)
                         {
                             if (i.getTipo().equals("Monstruo")) 
                             {
                                 mouns++;
                                 
                             }
                             if (i.getTipo().equals("Trampa")) 
                             {
                                 tramp++;                                 
                                 
                             }
                             if (i.getTipo().equals("Hechizo")) 
                             {
                                 hechi++;                                 
                             }
                             System.out.println("Nombre: "+i.getNombre()+" Tipo: "+i.getTipo());
                         }
                         
                         System.out.println("Trampa: "+tramp);
                         System.out.println("Monstruo: "+mouns);
                         System.out.println("Hechizo: "+hechi);
                        
                     }
                     
                     if (tipo.equals("4")) 
                     {
                         String mouns="";
                         String tramp="";
                         String hechi="";
                         int Mouns=0;
                         int Tramp=0;
                         int Hechi=0;
                         for(Carta i:usuario)
                         {
                             if (i.getTipo().equals("Monstruo")) 
                             {
                                 mouns+="Nombre: "+i.getNombre()+" Tipo: "+i.getTipo()+"\n";
                                 Mouns++;
                             }
                             if (i.getTipo().equals("Trampa")) 
                             {
                                 tramp+="Nombre: "+i.getNombre()+" Tipo: "+i.getTipo()+"\n"; 
                                 Tramp++;
                                 
                             }
                             if (i.getTipo().equals("Hechizo")) 
                             {
                                 hechi+="Nombre: "+i.getNombre()+" Tipo: "+i.getTipo()+"\n";   
                                 Hechi++;
                             }
                            
                         }
                         System.out.println("Monstruo, Cantidad"+Mouns);
                         System.out.println(mouns);
                         System.out.println("");
                         System.out.println("Trampa, Cantidad"+Tramp);
                         System.out.println(tramp);
                         System.out.println("");
                         System.out.println("Hechizo, Cantidad"+Hechi);
                         System.out.println(hechi);
                        
                    }
                    
                    
                    
                    
                }
                
            
                
            
            
            }
        
        
        
        
        
        
        
        
    }
    
}
}
