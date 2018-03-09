package ht6estructuras;
import java.util.*;

public class Shuffler {
	
	private Map<String, String> map;
	
	public Shuffler (String type) {
		map = Factory.getMap(type);		
	}

	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public String displayCards() {
		String cards = "";
		return cards;
	}

}
