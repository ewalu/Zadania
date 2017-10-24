package pl.atena.edu.zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
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
			lista = przetwarzajLinie(line);
			zliczanie = zliczaj(zliczanie, lista);
			
		}
		sc.close();
		} catch (FileNotFoundException e) {
			logger.throwing("PrzeszukiwaniePliku","wczytajPlik", e);
		}
		zliczanie.entrySet().forEach(item-> System.out.println(item));

	}
//zliczanie s��w
public Map<String, Integer> zliczaj(Map<String, Integer> licznik, String[] lista) {
	for (int i = 0; i<lista.length; i++) {
		licznik.merge(lista[i], 1, Integer::sum);
	}
	return licznik;
}
//funkcja dzieli stringa na tablic� string�w
public String[] przetwarzajLinie(String line) {
	String[] lista;
	lista = line.split("\\s");
	return lista;
}
}
