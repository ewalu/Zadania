package pl.atena.edu.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class Generyki {
	
	private Logger logger = Logger.getLogger(Generyki.class.getCanonicalName());
	
	public <T> void test (T parametr) {
		logger.info(parametr.toString());
	}
	
	public <T,S> void przypis (T t1, T t2, S s1) {
		List<S> list = new ArrayList<S>();
		list.add((S) t1);
		list.add((S) t2);
		list.add(s1);
		System.out.println(list.toString());
		
		
	}
	
	public Generyki() {
		
	}
	
	public void iDiki(List<? extends AId> lista) {
		lista.forEach(x -> System.out.println(x.PrzedstawSie()));
	}
	
	public <T extends AId> void filtruj(List<T> lista, Predicate<? super T> pre) {
		for (T element:lista) {
			if (pre.test(element)) {
				logger.info(element.PrzedstawSie());
			}
		}
	}

}
