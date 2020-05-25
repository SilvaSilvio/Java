package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		File file = new File("Buffered.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			bw.write(" Uma vida produtiva não é obra do acaso.");
			bw.newLine();
			bw.write("quero  saber se essa escrita irá aparecer");
			bw.newLine();
			bw.write("Vamos completar o 100");
			bw.flush();
			bw.close();
			
			int size = br.read();
			System.out.println("Tamanho: "+ size);
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			/*
			 * char[] in = new char[100]; int size = fileReader.read(in);
			 * System.out.println("Tamanho: " + size); for(char tamanho : in)
			 * System.out.print(tamanho); fileReader.close(); ;
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
