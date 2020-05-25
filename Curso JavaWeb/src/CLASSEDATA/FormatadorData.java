package CLASSEDATA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormatadorData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a data DIA, MES, ANO");
		SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatoSaida = new SimpleDateFormat("'Goiania,' dd ' de ' MMMM ' de 'yyyy: ");
		String dataTexto = scan.next();
		try {
			Date data = formatoEntrada.parse(dataTexto);
			String outraDataTexto = formatoSaida.format(data);
			System.out.println(outraDataTexto);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
