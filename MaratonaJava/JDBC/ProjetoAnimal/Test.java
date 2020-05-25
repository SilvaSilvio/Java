package ProjetoAnimal;

public class Test {

	public static void main(String[] args) {
		//AnimalDB adb = new AnimalDB();
		save();
		
	}
	public static void save() {
		Animal animal = new Animal("Juca", "Pincher");
		AnimalDB adb = new AnimalDB();
		adb.save(animal);
	}

}
