package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered2 {

	public static void main(String[] args) {
		File file = new File("Projeto1.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			BufferedReader br = new BufferedReader(new FileReader(file));
			bw.write("Logica de Programaçao");
			bw.newLine();
			bw.write("Analise de programação orientada a Objeto");
			bw.flush();
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
