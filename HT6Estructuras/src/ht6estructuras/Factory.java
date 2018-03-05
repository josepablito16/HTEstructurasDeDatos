/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6estructuras;

/**
 *
 * @author jose
 */
public class Factory 
{
    
    
    Factory(){}
    /**
     * este es el metodo del diseño de patrones el cual nos devuelve la instancia
     * del tipo de lista a usar dependiendo que ingresa el usuario
     * @param opcion opcion elegida por el usuario
     * @return instancia de lista a usar
     */
    public static Map getMap(String opcion) 
    {
        
        if (opcion.equals("1")) 
        {
            return new StackArrayList();
            
        }
        else if(opcion.equals("2"))
        {
            return new StackVector();
        }
        else if (opcion.equals("3"))
        {
            return new SinglyLinkedList();
        }
        
        
        
    
    
    
}
