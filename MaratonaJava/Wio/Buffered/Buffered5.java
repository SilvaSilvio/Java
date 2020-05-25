package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered5 {

	public static void main(String[] args) {
File file = new File("Projeto4.txt");
try {
BufferedWriter bw = new BufferedWriter(new FileWriter(file));
BufferedReader br = new BufferedReader(new FileReader(file));
bw.write("Hoje ela só quer paz");
bw.newLine();
bw.write("Ela não é o tipo de mulher que se envolve na primeira");
bw.flush();
bw.close();
String s = null;
while(( s = br.readLine())!=null ) {
	System.out.println(s);
}
br.close();
}catch(IOException e) {
	e.printStackTrace();
}
	}

}
