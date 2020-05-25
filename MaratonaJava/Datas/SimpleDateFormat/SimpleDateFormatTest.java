package SimpleDateFormat;

//import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String mascara= "yyyy.MM.dd 'at' HH:mm:ss";
		SimpleDateFormat formataData = new SimpleDateFormat(mascara);
		
		System.out.println(formataData.format(c.getTime()));

	}

}
