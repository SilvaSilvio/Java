package Test2InserindoValores;

import java.sql.Savepoint;

public class TestConexao {

	public static void main(String[] args) {
		//Eletrodomestico test = new Eletrodomestico("silvio", 1100);
		//EletrodomesticoDB el = new EletrodomesticoDB();
	//	el.save(test);
		
//	deletar();
		update();

	}
	public static void inserir() {
		Eletrodomestico ele = new Eletrodomestico("Dadimar", 4000);
		EletrodomesticoDB edb = new EletrodomesticoDB();
		edb.save(ele);
	}
	public static void deletar() {
		Eletrodomestico ele = new Eletrodomestico();
		ele.setNome("silvio");
		EletrodomesticoDB elea= new EletrodomesticoDB();
		elea.delete(ele);
		}
	public static void update() {
		Eletrodomestico ele = new Eletrodomestico("Rayan", 100);
		EletrodomesticoDB atualiza = new EletrodomesticoDB();
		atualiza.udate(ele);
		
	}

}
