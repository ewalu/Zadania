package pl.atena.edu.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Table<K,V> {
	
	private List<Entry<K,V>> list = new ArrayList<>();
	
	public void add(K key, V value) {
		list.add(new Entry<>(key, value));
	}
	
	public void add(Entry<K,V> entry) {
		list.add(entry);
	}
	
	public V get(K key) {
		for (Entry<K,V> element:list) {
			if (element.getKey().equals(key)) {
				return element.getValue();
			}
		}
		return null;
	}
	
	public void remove(K key) {
		for (Entry<K,V> element:list) {
			if (element.getKey().equals(key)) {
				list.remove(element);
				break;
			}
		}
	}
	
	public void remove1(K key) {
		list.remove(filtruj(key));
	}
	
	public void prezentuj() {
		list.forEach(x -> System.out.println(x.getKey().toString()+" - "+x.getValue().toString()));
	}
	
	public Entry<K,V> filtruj(K key) {
		Predicate <Entry<K,V>> pred = new Predicate <Entry<K,V>>() {
			@Override
			public boolean test(Entry<K,V> t) {
				return t.getKey().equals(key);
			}
			
		};
		for (Entry<K,V> element:list) {
			if (pred.test(element)) {
				return element;
			}
		}
		return null;
	}

}

