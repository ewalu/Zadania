package pl.atena.edu.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Generyki generyki = new Generyki();
		
		Predicate<AId> pre = new Predicate<AId>() {
			@Override
			public boolean test(AId t) {
				return t.PrzedstawSie().equals("ewa1");
			}
			
		};
		
		generyki.test("ewa");
		generyki.test(1);
		generyki.test(true);
		
		generyki.przypis(1, "ewa", true);
		
		List<IDString> l1 = new ArrayList<>();
		l1.add(new IDString("ewa1"));
		
		generyki.iDiki(l1);
		
		List<Id> l2 = new ArrayList<>();
		l2.add(new Id(9));
		
		List<Id> l3 = new ArrayList<>();
		l3.add(new IDString2("1","test1"));
		l3.add(new IDString2("2","test2"));
		
		generyki.filtruj(l1, pre);
		
		generyki.iDiki(l2);

	}

}
