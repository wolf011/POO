package org.serratec.exemplos;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class TesteLocalDate {

	public static void main(String[] args) {

		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
		LocalDate dataManual = LocalDate.of(2025, 4, 15);
		System.out.println(dataManual.plusDays(10));
		
		Locale locale = new Locale ("pt", "BR");
		
		System.out.println(dataManual.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale));
		System.out.println(dataManual.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
	
		System.out.println(dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
		System.out.println(dataHoje.isLeapYear()? "Sim": "Não");
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora.plusHours(2));
		
		LocalDate dataNascimento = LocalDate.of(2001, 02, 10);
		
//		Classe para fazer comparações
		Period periodo = Period.between(dataNascimento, dataHoje);
		System.out.println(periodo.getYears() + " anos " + periodo.getMonths() +" meses "+ periodo.getDays() + " dias.");
		
//		Dias entre a comparação de anos.
		System.out.println(ChronoUnit.DAYS.between(dataNascimento, dataHoje));
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
//		Formatar data
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-M-yy");
		DateTimeFormatter formatarData2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dataHoje.format(formatarData));
		System.out.println(dataNascimento.format(formatarData2));
	}

}
