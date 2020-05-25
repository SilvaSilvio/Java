package CLIENTE;

public class principal {
public static void main(String... args) {
	Cliente[] cliente = new Cliente[3];
	cliente[0] = new Cliente("Silvio", 12, 1212121);
	cliente[1] = new Cliente("Ferreira", 13, 134234234);
	cliente[2] = new Cliente("Silva", 14, 1232556342);
	//cliente[3] = new Cliente("asdf", 3, 1231231221);
	
for (Cliente clientes : cliente) {
	System.out.println(clientes);
}

}


}
