package ControleRemoto;

public class Principal {
public static void main(String... args) {
	ControleRemoto[] control = new ControleRemoto[2];
	control[0] = new Video();
	control[1] = new dvdPlayer();
	for (ControleRemoto controleRemoto : control) {
		System.out.println(controleRemoto.getNome());
		controleRemoto.iniciar();
		controleRemoto.pausar();
		controleRemoto.parar();
	}
}
}
