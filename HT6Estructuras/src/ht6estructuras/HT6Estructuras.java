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
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class HT6Estructuras {

    
    private static Scanner teclado;

	public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String linea;
        File archivo = new File ("./cards_desc.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println("Ingrese la opcion dependiendo de la implementacion"+"\n"
                + "que quiere hacer");
        
        
        
        teclado = new Scanner(System.in);
        
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
                while( (linea=br.readLine())!=null)
                {
                    
                    
                }
                
            
                
            
            
            }
        
        
        
        
        
        
        
        
    }
    
}
}
