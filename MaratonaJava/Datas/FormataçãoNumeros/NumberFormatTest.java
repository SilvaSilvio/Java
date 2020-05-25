package FormataçãoNumeros;

import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatTest {
	public static void main(String... args) {
		float valor = 123.456f;
		Locale locPT = new Locale("PT");
		NumberFormat[] nf = new NumberFormat[4];
		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(locPT);
		nf[2] = NumberFormat.getCurrencyInstance();
		nf[3] = NumberFormat.getCurrencyInstance(locPT);
		
		for (NumberFormat numberFormat : nf) {
			System.out.println(numberFormat.format(121212));
			
		}

	}
}
