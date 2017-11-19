package pl.atena.edu.zadania;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {

	public static void main(String[] args) {
		String[] tab = {"b","bbbb", "aaaaa","aa","aaaaaaaaaa"};
		
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String pierwszy, String drugi) {
				return pierwszy.length() - drugi.length();
			}
			
		};
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		Arrays.sort(tab,comp);
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		

	}

}
