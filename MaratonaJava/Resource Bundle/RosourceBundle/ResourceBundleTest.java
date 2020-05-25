package RosourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String... args) {
		// System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		System.out.println(rb.getString("oi"));
		// System.out.println(rb.getString("good.moning"));
		// System.out.println(rb.getString("até.mais"));
	}
}
