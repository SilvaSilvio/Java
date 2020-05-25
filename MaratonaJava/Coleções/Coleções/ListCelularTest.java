package Coleções;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

	public static void main(String[] args) {
List<String> lista = new ArrayList<>();
lista.add("Pai");
lista.add("Paizão");
List<String> numeros = new ArrayList<>();
numeros.add("2");
numeros.add("3");
lista.addAll(numeros);

for(String resultado : lista) {
	System.out.println(resultado);
}

	}

}
