package pl.atena.edu.zadania;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2017, 02, 28);
		int br = LocalDate.now().getYear();
		LocalDate teraz = LocalDate.now();
		LocalDate ur = LocalDate.of(LocalDate.now().getYear(),Month.MAY,5);
		Period period = Period.between(ur, teraz);
		System.out.println(period);

	}

}
