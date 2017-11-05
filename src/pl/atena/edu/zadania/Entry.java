package pl.atena.edu.zadania;

public class Entry<K,V> {
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}

}
