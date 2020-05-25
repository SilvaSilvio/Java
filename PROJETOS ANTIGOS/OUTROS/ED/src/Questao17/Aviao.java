package Questao17;

public abstract class Aviao {
	Voar voarForma;
	Pousar pousarForma;

	public Aviao() {

	}

	public abstract void informarDados();

	public void performanceVoar() {
		voarForma.voar();
	}

	public void performancePousar() {
		pousarForma.pousar();
	}

	public void setVoar(Voar v) {
		voarForma = v;
	}

	public void setPousar(Pousar p) {
		pousarForma = p;
	}

}
