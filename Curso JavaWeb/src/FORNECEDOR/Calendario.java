package FORNECEDOR;

public class Calendario {

	public static void main(String[] args) {
Curso[] c = new Curso[5];
c[0] = new Curso("Programação" + LinguagemProgramacao.JAVA, LinguagemProgramacao.JAVA);
c[1] = new Curso("Programação", LinguagemProgramacao.C);
c[2] = new Curso("Programação Delphi", LinguagemProgramacao.DELPHI);
c[3] = new Curso("Programação PHP", LinguagemProgramacao.PHP);
c[4] = new Curso("Programação Ruby", LinguagemProgramacao.RUBY);

for (Curso curso : c) {
	System.out.println(curso.toString());
}
Curso c1 = new Curso("Java Avançado", LinguagemProgramacao.JAVA);
Curso c2 = new Curso("Java Avançado", LinguagemProgramacao.JAVA);

if(c1 == c2) {
	System.out.println("c1 == c2");
}
else 
	System.out.println("c1 != c2");
}

	
	
}
