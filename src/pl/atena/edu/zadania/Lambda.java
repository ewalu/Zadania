package pl.atena.edu.zadania;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Lambda {
	
	public static void zadanie(List<Towar> towary, Consumer<Towar> consumer) {
		towary.forEach(consumer::accept);
	};
	
	public interface MyFunctionalInterface {
		void fire (String sentencja);
	}

	public static void main(String[] args) {
		
		MyFunctionalInterface mysl = (m) -> System.out.println("aaaa: " + m);
		mysl.fire("bbbb");
		
		Consumer<Towar> wyswietl = item -> {
			StringBuffer sb = new StringBuffer();
			sb.append(item.getRodzaj()).append(" ").append(item.getIlosc()).append(" ").append(item.getCena());
			System.out.println(sb.toString());
		};
		
		List<Towar> towary = new ArrayList<>();
		
		towary.add(new Towar(Rodzaj.PIWO, true, BigDecimal.valueOf(4.99), 1));
		towary.add(new Towar(Rodzaj.BANAN, false, BigDecimal.valueOf(2.99), 2));
		towary.add(new Towar(Rodzaj.FAJKI, false, BigDecimal.valueOf(1.99), 1));
		towary.add(new Towar(Rodzaj.JABLKO, false, BigDecimal.valueOf(1.98), 3));
		towary.add(new Towar(Rodzaj.FAJKI, false, BigDecimal.valueOf(1.98), 2));
		
		zadanie(towary, wyswietl);
		zadanie(towary, item -> item.zerujIlosc());
		
		towary.sort(Comparator.comparing(Towar::getCena).thenComparing(Towar::getRodzaj));
		
		zadanie(towary, wyswietl);
		
		String[] tab = {"b","bbbb", "aaaaa","aa","aaaaaaaaaa"};
		List<String> lista = new ArrayList<>();
		
		lista.add("ewa1");
		lista.add("ewa2");
		lista.add("");
		lista.forEach(item -> System.out.println(item));
		
		//lista.removeIf(element -> Objects.nonNull(element));
		lista.removeIf(element -> Objects.equals(element, "ewa1"));
		
		lista.forEach(System.out::println);
		
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String pierwszy, String drugi) {
				return pierwszy.length() - drugi.length();
			}
			
		};
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		Arrays.sort(tab, (pierwszy, drugi)-> pierwszy.length() - drugi.length());
		//Arrays.sort(tab, (pierwszy, drugi) -> pierwszy.compareToIgnoreCase(drugi));
		//Arrays.sort(tab,comp);
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		

	}

}
