package ProjetoAnimal;

public class Animal {
	private int id_animal;
	private String nome;
	private String raca;
	private float peso;

	public Animal(String nome, String raca, float peso) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
	}
	

	public Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}


	public Animal() {
		super();
	}

	public int getId_animal() {
		return id_animal;
	}

	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
