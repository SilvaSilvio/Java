package Datas;

import java.util.Calendar;
import java.util.Date;

public class DatasTest {
	public static void main(String... args) {

		Date date = new Date();
		System.out.println(date.getTime());

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c);

		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana");
		}else {
			System.out.println("Esse não é o primeiro domingo da Semana");
		}
		
		System.out.println("O dia do mês é " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("O dia da semana é " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("O dia do ano é " + c.get(Calendar.DAY_OF_YEAR));

		c.add(Calendar.HOUR, 24);
		Date data2 = c.getTime();
		System.out.println(data2);
	}
}
