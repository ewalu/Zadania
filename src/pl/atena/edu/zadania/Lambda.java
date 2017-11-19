package pl.atena.edu.zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Lambda {

	public static void main(String[] args) {
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
