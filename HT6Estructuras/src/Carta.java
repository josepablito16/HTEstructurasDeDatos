/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Es la clase modelo para almacenar las cartas del usuario. Tiene como
 * atributos el nombre y tipo de la carta y los getters como métodos.
 * 
 * @author Javier Anleu - 17149
 * @author Jose Cifuentes - 17509
 * @since March 5, 2018
 * @version 1.0
 */
public class Carta {
	private String nombre;
	private String tipo;

	public Carta(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

}
