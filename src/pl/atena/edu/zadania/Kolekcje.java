package pl.atena.edu.zadania;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Kolekcje {
	
	public static void main(String[] args) {
	List<String> lista = new ArrayList<>();
	lista.add("ewa");
	lista.add("Jan");
	lista.add("azor");
	
	//System.out.println(lista);
	
	final List<String> result = new ArrayList<>();
	
	lista.forEach(item -> {
		if ("E".equals(item.substring(0,1).toUpperCase())) {
			result.add(item);
		}
	});
	
	//System.out.println(result);
	
	lista.removeIf(item->"A".equals(item.substring(0,1).toUpperCase()));
	
	//System.out.println(lista);
	
	Map<Rodzaj, Towar> towary = new HashMap<>();
	Towar Piwko = new Towar(Rodzaj.PIWO, true, BigDecimal.valueOf(1.9), 90);
	Towar Szlugi = new Towar(Rodzaj.FAJKI, true, BigDecimal.valueOf(1.9), 90);
	towary.put(Piwko.rodzaj(), Piwko);
	towary.put(Szlugi.rodzaj(), Szlugi);
	
	//String test[] = {"E","W"};
	//List<String> lista1 = Arrays.asList(test);
	//lista1.add("A");
	
	File file = new File("C:\\Users\\ewalu1\\Desktop\\dok.txt");
	Plik plik = new Plik();
	plik.Wczytaj(file);
	
	}

}
