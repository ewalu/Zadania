package pl.atena.edu.zadania;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2017, 02, 28);
		int br = LocalDate.now().getYear();
		LocalDate teraz = LocalDate.now();
		LocalDate ur = LocalDate.of(1986,Month.MAY,5);
		Period period = Period.between(ur,teraz);
		System.out.println(period);
		
		long dni = ur.until(teraz,ChronoUnit.DAYS);
		System.out.println(dni);
		
		//System.out.println(ur.getDayOfWeek());
		
		ZonedDateTime zdt = ZonedDateTime.now();
		
		LocalDate st = LocalDate.of(1901, Month.JANUARY, 13);
		LocalDate kn = LocalDate.of(2000, Month.DECEMBER, 14);
		
		//LocalDate st2 = st.plusMonths(1);
		System.out.println(st.getDayOfWeek());
		int suma = 0;
		
		/*for(int i =0; i<10; i++) {
			System.out.println(st.plusMonths(i));
		};*/
		
		while (st.isBefore(kn)) {
			if (st.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
				suma++;
			}
			st = st.plusMonths(1);
		}
		
		System.out.println(suma);
		
		
		
		
		
		

	}

}
