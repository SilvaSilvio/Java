package ProjetoComprador;

public class Test {

	public static void main(String[] args) {
		save();
		//delete();
		//update();
	}
	public static void save() {
		Comprador c = new Comprador("000.000.000-21", "Jeovana");
		CompradorDB cdb = new CompradorDB();
		cdb.save(c);
			}
	public static void delete() {
		Comprador c = new Comprador();
		c.setId_comprador(3);
		CompradorDB cdb = new CompradorDB();
		cdb.delete(c);
			}
	public static void update() {
		Comprador c = new Comprador(1, "020.890.980-02", "Dafine");
		CompradorDB cdb = new CompradorDB();
		cdb.update(c);
	}

}
