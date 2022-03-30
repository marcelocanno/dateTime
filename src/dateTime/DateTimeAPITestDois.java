package dateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITestDois {

	public static void main(String[] args) {
		
		System.out.println("-------------------- Instant --------------------------");
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(LocalDateTime.now());
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.getNano());  // tamanho 999.999.999
		System.out.println(instant.ofEpochSecond(4));
		System.out.println(instant.ofEpochSecond(3,0));  
		// acrescenta nano segundos ao tempo calendario 1970
		// acrescenta horario ao tempo de 1970
		System.out.println(instant.ofEpochSecond(2,1_000_000_000));
		System.out.println(instant.ofEpochSecond(4,-1_000_000_000));
		System.out.println("--------------------- Duration ------------------------");
		// pega intervalo entre duas datas - dias - anos
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2017, 1,1,23,0,0);
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(5, 0,0);
		// Nao pode utilizar LocalDate
		// Nao pode misturar LocalDateTime e LocalTime
		Duration d1 = Duration.between(dt1, dt2);
		//Duration d2 = Duration.between(dt2, time2);  // nao aceitou a mistura
		Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		              // nao permitidos
		//Duration d4 = Duration.between(dt2, time2);
		//Duration d5 = Duration.between(LocalDate.now(), LocalDate.now().plusDays(20));
		
		Duration d6 = Duration.between(dt2, time2.atDate(dt2.toLocalDate()));
		Duration d7 = Duration.ofMinutes(3);
		Duration d8 = Duration.ofDays(10);
		
		System.out.println(d1);
		//System.out.println(d2);    // nao aceitou a mistura
		System.out.println(d3);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println("-------------- Period - periodos ----------------------");
		
		Period p1 = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
		Period p2 = Period.ofDays(10);
		Period p3 = Period.ofWeeks(58);
		Period p4 = Period.ofYears(3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(Period.between(LocalDate.now(),LocalDate.now().plusDays(p3.getDays())));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
		
		System.out.println("-------------    CHRONOUNIT --------------------------");
		LocalDateTime aniversario = LocalDateTime.of(1959, 4,9, 14,30,0);
		System.out.println(ChronoUnit.DAYS.between(aniversario, now));
		System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
		System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
		System.out.println(ChronoUnit.YEARS.between(aniversario, now));
		
		
		
		

	}

}
