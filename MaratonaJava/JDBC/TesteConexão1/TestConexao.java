package TesteConexão1;

import java.util.List;

public class TestConexao {

	public static void main(String... args) {
		// ConnectFactory connection = new ConnectFactory();
		// CompradorBD cdb = new CompradorBD();
		// cdb.save();
		//save();
		 delete();
		// update();
//sellectAll();
	//	List<Comprador> compradorList = sellectAll();
		//System.out.println(compradorList);
		// CompradorBD.selectMetaData();
		//CompradorBD.checkedDriverStatus();
		//CompradorBD.testTypeScroll();
	}

	public static void save() {
		Comprador c = new Comprador("002.334.333-04", "Beuga");
		CompradorBD cbd = new CompradorBD();
		cbd.save(c);
	}

	public static void delete() {
		CompradorBD cbd = new CompradorBD();
		Comprador c = new Comprador();
		c.setId_comprador(8);
		// c[1].setId_comprador(6);
		cbd.delete(c);

		// for(Comprador comp : c) {
		// cbd.delete(c);
		// System.out.println(comp);
		// }

	}

	public static void update() {
		Comprador c = new Comprador(1, "020.788.282-99", "Beuga");
		CompradorBD cd = new CompradorBD();
		cd.update(c);

	}

//	public static List<Comprador> sellectAll() {
		//return CompradorBD.selectAll();

		// CompradorBD bd = new CompradorBD();
		// bd.selectAll();
	//}
}
