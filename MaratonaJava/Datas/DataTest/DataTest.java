package DataTest;

import java.text.DateFormat;
import java.util.Calendar;

public class DataTest {

	public static void main(String[] args) {
Calendar c = Calendar.getInstance();
DateFormat[] data = new DateFormat[6];

data[0] = DateFormat.getInstance();
data[1] = DateFormat.getDateInstance();
data[2] = DateFormat.getDateInstance(DateFormat.SHORT);
data[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
data[4] = DateFormat.getDateInstance(DateFormat.FULL);
data[5] = DateFormat.getDateInstance(DateFormat.LONG);

for (DateFormat date : data)
	System.out.println(date.format(c.getTime()));
	}

}
