package Polimorfismo;

public class DAOtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArquivoDAOimpl arquivoDAO = new ArquivoDAOimpl();
		arquivoDAO.save();
		
		//Utilizando o GENERICDAO n�o h� necessidade de est� criando objetos de refencias.
		GenericDAO arquivoDAO1 = new DatabaseImp();
		arquivoDAO1.save();
	}

}