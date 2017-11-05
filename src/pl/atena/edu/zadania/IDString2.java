package pl.atena.edu.zadania;

public class IDString2<T> extends IDString {
	
	private T value;
	private T value2;

	public IDString2(T value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	public IDString2(T value, T value2) {
		super(value);
		this.value2 = value2;
	}
	
	

}
