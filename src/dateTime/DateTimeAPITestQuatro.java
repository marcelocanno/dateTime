package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class DateTimeAPITestQuatro {

	public static void main(String[] args) {
		
		// ajustes de tadas para futuro e passado
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		// tempo sem sexta, sabado e domingo
		
		date = date.with(new DataUtil());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.plusDays(3);
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		
		date = date.with(new DataUtil());
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
	}

}
