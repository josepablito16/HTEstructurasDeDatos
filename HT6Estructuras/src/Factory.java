/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 * Es el factory para las implementaciones de MAP. Utiliza las clases ya
 * definidas por el Java Collection Framework y dependiendo de la implementación
 * seleccionada, devuelve el map correspondiente.
 * 
 * @author Javier Anleu - 17149
 * @author Jose Cifuentes - 17509
 * @since March 5, 2018
 * @version 1.0
 */
public class Factory {

	Factory() {
	}

	/**
	 * este es el metodo del diseño de patrones el cual nos devuelve la instancia
	 * del tipo de lista a usar dependiendo que ingresa el usuario
	 * 
	 * @param opcion
	 *            opcion elegida por el usuario
	 * @return instancia de lista a usar
	 */
	public static Map<String, String> getMap(String opcion) {

		if (opcion.equals("1")) {
			return new HashMap<String, String>();

		} else if (opcion.equals("2")) {
			return new TreeMap<String, String>();
		} else if (opcion.equals("3")) {
			return new LinkedHashMap<String, String>();
		}
		return null;

	}
}
