package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITestTres {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2017, 2, 25);
		System.out.println(localDate);
		localDate = localDate.withYear(2020);  
				// altera as datas, dia, mes ou ano
		System.out.println(localDate);
		localDate = localDate.withMonth(Month.AUGUST.getValue());
		System.out.println(localDate);
		localDate = localDate.withDayOfMonth(20);
		System.out.println(localDate);
		localDate = localDate.with(ChronoField.DAY_OF_MONTH,15);
		System.out.println(localDate);
				// acrescenta meses, dias ou ano a frente da data
		        // pode acrescentar e retirar dias, meses ou anos
		localDate = localDate.plusMonths(5);
		System.out.println(localDate);
		localDate = localDate.plus(2,ChronoUnit.MONTHS);
		System.out.println(localDate);
		localDate = localDate.plusMonths(2).minusDays(20);
		System.out.println(localDate);
		
		System.out.println("--------------------- Time -------------------------");
					// troca  ou  adcionaa hora anterior
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.withHour(10);
		System.out.println(time);
		time = time.plusHours(15);
		System.out.println(time);
		time = time.plusHours(5).minusMinutes(30);
		System.out.println(time);
		
		
		
		
		
		
	}

}
