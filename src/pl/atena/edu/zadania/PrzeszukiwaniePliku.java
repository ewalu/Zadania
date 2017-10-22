package pl.atena.edu.zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class PrzeszukiwaniePliku {
	
	protected Logger logger = Logger.getGlobal();

	public void main(String[] args) {
		try {
		File file = new File("E:\\Dokumenty\\edu\\javka\\Zadania\\doc.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			przetwarzajLinie(line);
			
		}
		sc.close();
		} catch (FileNotFoundException e) {
			logger.throwing("PrzeszukiwaniePliku","wczytajPlik", e);
		}
		
		
	}
	private void przetwarzajLinie(String line) {
		List<String> lista = new ArrayList<>();
	}
	

}
