/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Es el main del programa. Se encarga de recibir los inputs y devolver la
 * información según es solicitada por el usuario.
 * 
 * @author Javier Anleu - 17149
 * @author Jose Cifuentes - 17509
 * @since March 5, 2018
 * @version 1.0
 */
public class HT6Estructuras {

	private static Scanner teclado;
	private static BufferedReader br;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String linea;
		// File archivo = new File ("./cards_desc.txt");
		File archivo = new File(
				"./cards_desc.txt");
		FileReader fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		new Factory();

		System.out.println("Ingrese la opcion dependiendo de la implementacion" + "\n" + "que quiere hacer");

		ArrayList<Carta> usuario = new ArrayList<Carta>();

		teclado = new Scanner(System.in);
		// String x = "hola";
		// System.out.println(x.indexOf("o"));// devuelve 1

		while (true) {
			System.out.println("1. HashMap");
			System.out.println("2. TreeMap");
			System.out.println("3. LinkedHashMap");
			System.out.println("4. Salir");

			System.out.print("\n  Ingrese la Opcion: ");
			String tipo = teclado.nextLine();

			if (tipo.equals("4")) {
				System.out.println("Saliendo...");
				System.out.println("Se ha cerrado el programa.");
				break;
			}

			if ((tipo.equals("1")) || (tipo.equals("2")) || (tipo.equals("3"))) {
				//
				String nombre = "";
				String contenido = "";
				Map<String, String> m = Factory.getMap(tipo);
				while ((linea = br.readLine()) != null) {
					nombre = linea.substring(0, linea.indexOf("|"));
					contenido = linea.substring(linea.indexOf("|") + 1, linea.length());

					m.put(nombre, contenido);

				}

				while (true) {
					System.out.println("Ingrese una opcion");
					System.out.println("1. Agregar carta a la coleccion del usuario");
					System.out.println("2. Mostrar el tipo de carta especifica");
					System.out
							.println("3. Mostrar el nombre, tipo y cantidad de cada carta de la coleccion del usuario");
					System.out.println(
							"4. Mostrar nombre, tipo y cantidad de cada carta que el usuario tiene. Ordenada por tipo");
					System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
					System.out
							.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
					System.out.println("7. Salir");

					System.out.print("\n  Ingrese la Opcion: ");
					tipo = teclado.nextLine();

					if (tipo.equals("7")) {
						System.out.println("Saliendo...");
						break;

					}

					if (tipo.equals("1")) {
						System.out.print("\n  Ingrese el nombre de la carta que desea agregar: ");
						tipo = teclado.nextLine();
						String carta = (String) m.get(tipo);

						if (carta == null) {
							System.out.println("No existe la carta!");

						} else {
							Carta c = new Carta(tipo, carta);
							usuario.add(c);

						}

					}

					if (tipo.equals("2")) {
						System.out.print("\n  Ingrese el nombre de la carta para saber su tipo: ");
						tipo = teclado.nextLine();
						String carta = (String) m.get(tipo);

						if (carta == null) {
							System.out.println("No existe la carta!");

						} else {
							System.out.println("El tipo de carta es: " + carta);

						}

					}

					if (tipo.equals("3")) {
						int mouns = 0;
						int tramp = 0;
						int hechi = 0;
						for (Carta i : usuario) {
							if (i.getTipo().equals("Monstruo")) {
								mouns++;

							}
							if (i.getTipo().equals("Trampa")) {
								tramp++;

							}
							if (i.getTipo().equals("Hechizo")) {
								hechi++;
							}
							System.out.println("Nombre: " + i.getNombre() + " Tipo: " + i.getTipo());
						}

						System.out.println("Trampa: " + tramp);
						System.out.println("Monstruo: " + mouns);
						System.out.println("Hechizo: " + hechi);

					}

					if (tipo.equals("4")) {
						String mouns = "";
						String tramp = "";
						String hechi = "";
						int Mouns = 0;
						int Tramp = 0;
						int Hechi = 0;
						for (Carta i : usuario) {
							if (i.getTipo().equals("Monstruo")) {
								mouns += "Nombre: " + i.getNombre() + " Tipo: " + i.getTipo() + "\n";
								Mouns++;
							}
							if (i.getTipo().equals("Trampa")) {
								tramp += "Nombre: " + i.getNombre() + " Tipo: " + i.getTipo() + "\n";
								Tramp++;

							}
							if (i.getTipo().equals("Hechizo")) {
								hechi += "Nombre: " + i.getNombre() + " Tipo: " + i.getTipo() + "\n";
								Hechi++;
							}

						}
						System.out.println("Monstruo, Cantidad" + Mouns);
						System.out.println(mouns);
						System.out.println("");
						System.out.println("Trampa, Cantidad" + Tramp);
						System.out.println(tramp);
						System.out.println("");
						System.out.println("Hechizo, Cantidad" + Hechi);
						System.out.println(hechi);

					}

					if (tipo.equals("5")) {
						int count = 1;
						for (String i : m.keySet()) {
							String name = "";
							String type = m.get(i);
							if (m.get(i).equals(type)) {
								name = i;
							}
							System.out.println(count + ". " + name + ". Tipo: " + type);
							count++;
						}
					}

					if (tipo.equals("6")) {
						String monsters = "";
						String traps = "";
						String curses = "";
						int count1 = 1;
						int count2 = 1;
						int count3 = 1;
						for (String i : m.keySet()) {
							if (m.get(i).equals("Monstruo")) {
								monsters = monsters + count1 + ". " + i + "\n";
								count1++;
							} else if (m.get(i).equals("Trampa")) {
								traps = traps + count2 + ". " + i + "\n";
								count2++;
							} else if (m.get(i).equals("Hechizo")) {
								curses = curses + count3 + ". " + i + "\n";
								count3++;
							}
						}
						System.out.println(
								"Monstruos: \n" + monsters + "\nTrampas: \n" + traps + "\nHechizos: \n" + curses);
					}
				}

			}

		}

	}
}
