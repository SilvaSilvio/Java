
public class AplicationJava03 {


public static void main (String... args) {
Aluno a = new Aluno();
System.out.println("Classe aluno não tem construtor");
a.matricula = 4;
a.nome = "Silvio";
a.dadosAluno();

System.out.println("\nClasse professor com construtor");
Professor p = new Professor("Fábio", 50000);
p.dadosProfessor();

}

}
