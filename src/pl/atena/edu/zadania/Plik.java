package pl.atena.edu.zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class Plik {
	
	protected Logger logger = Logger.getGlobal();
	
	public void Wczytaj(File file) {
		Map<String, Integer> zliczanie = new HashMap<>();
		String[] lista;
		try {
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			line = line.toLowerCase();
			line = line.replaceAll("[.,—„”!?]","");
			lista = przetwarzajLinie(line);
			zliczaj(zliczanie, lista);
			
		}
		sc.close();
		} catch (FileNotFoundException e) {
			logger.throwing("PrzeszukiwaniePliku","wczytajPlik", e);
		}
		sortuj(zliczanie);

	}
//zliczanie 
private void zliczaj(Map<String, Integer> licznik, String[] lista) {
	for (int i = 0; i<lista.length; i++) {
		licznik.merge(lista[i], 1, Integer::sum);
	}
}
//funkcja dzieli stringa na tablicę stringów
private String[] przetwarzajLinie(String line) {
	String[] lista;
	lista = line.split(" ");
	return lista;
}
private void sortuj(Map<String, Integer> zliczanie) {
	List<Map.Entry<String, Integer>> lista = new ArrayList<Map.Entry<String, Integer>>(zliczanie.entrySet());
	lista.sort(new Comparator<Map.Entry<String, Integer>>() {
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			return (o1.getValue()).compareTo(o2.getValue());
		}
	});
	lista.forEach(item-> System.out.println(item));
}
}
