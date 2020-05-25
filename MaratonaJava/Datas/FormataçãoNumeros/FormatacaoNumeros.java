package FormataçãoNumeros;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class FormatacaoNumeros {
	public static void main(String... args) {
		Locale locale = new Locale("En");
		Calendar c = Calendar.getInstance();
		float calculaMoeda = 123.333f;
		NumberFormat[] nf = new NumberFormat[4];
		DateFormat[] df = new DateFormat[6];

		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getCurrencyInstance();
		nf[2] = NumberFormat.getCurrencyInstance(locale);
		nf[3] = NumberFormat.getInstance(locale);

		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance(DateFormat.LONG);
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);

		for (NumberFormat formate : nf) {
			System.out.println(formate.format(calculaMoeda));
		}
		for (DateFormat datas : df) {
			System.out.println(datas.format(c.getTime()));
		}
	}
}
