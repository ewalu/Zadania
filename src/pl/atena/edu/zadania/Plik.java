package pl.atena.edu.zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Plik {
	
	protected Logger logger = Logger.getGlobal();
	
	public void Wczytaj() {
		try {
		File file = new File("E:\\Dokumenty\\edu\\javka\\Zadania\\dok.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			przetwarzajLinie(line);
			
		}
		sc.close();
		} catch (FileNotFoundException e) {
			logger.throwing("PrzeszukiwaniePliku","wczytajPlik", e);
		}
		
		
	}

public void przetwarzajLinie(String line) {
	String[] lista;
	lista = line.split(" ");
	System.out.println(lista);
	//Map<String, Int> zliczanie = new HashMap<>();
}
}
