package pl.atena.edu.zadania;

public class Id<T> extends AId {
	
	private T value;
	
	public Id (T value) {
		super();
		this.value = value;
	}

	@Override
	String PrzedstawSie() {
		// TODO Auto-generated method stub
		return this.value.toString();
	}

}
