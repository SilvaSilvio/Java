package CheckedException;

import java.io.File;
import java.io.IOException;

public class chechedExeption {
	public static void main(String... args) {
		//criarArquivo();
		abrirArquivo();
	}

public static void criarArquivo() {
	File f = new File("text.txt");
	try {
		f.createNewFile();	
		System.out.println("Arquivo Criado");
	}
	catch(IOException e) {
		e.printStackTrace();
		System.out.println("Problema ao criar o arquivo");
	}
}
public static void abrirArquivo() {
	try {
		System.out.println("Abrindo o Arquivo");
		System.out.println("Execultando o Arquivo");
		System.out.println("escrendo no Arquivo");
		
	}catch(Exception e) {
		System.out.println("Dentro do catch");
		e.printStackTrace();
	}finally {
		System.out.println("Fechando no Arquivo");
	}
}
}
