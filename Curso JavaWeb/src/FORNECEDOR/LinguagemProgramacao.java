package FORNECEDOR;

public enum LinguagemProgramacao {
JAVA("java"), PHP("php"), DELPHI("delphi"), PYTOHN("python"), C("c"), RUBY("ruby");

	
private String text;

public String getText() {
	return text;
}
	
private LinguagemProgramacao(String text) {
this.text=text;
}
	
}