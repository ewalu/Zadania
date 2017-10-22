package pl.atena.edu.zadania;
import java.math.BigDecimal;

public interface ITowar {
	Rodzaj rodzaj();
	BigDecimal cena();
	int ilosc();
	boolean uzywka();
	
}
