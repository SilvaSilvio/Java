package CheckedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {

	public static void main(String[] args) {

	}

	public static void lerArquivo() {
		Reader reader = null;

		try {
			reader = new BufferedReader(new FileReader("Text.txt"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
