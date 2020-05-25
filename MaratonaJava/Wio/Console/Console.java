package Console;

public class Console {

	public static void main(String[] args) {
		java.io.Console c = System.console();
		char[] pw = c.readPassword("is, silva");
		for (char pass : pw)
			c.format("%c", pass);
		c.format("\n");
	}

}
