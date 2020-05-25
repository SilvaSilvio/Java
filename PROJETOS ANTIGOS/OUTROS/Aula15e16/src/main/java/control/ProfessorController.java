package control;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import model.BackendFrontend;
import model.GenericDAO;

public class ProfessorController <T> {	
	final Class<T> persistedClass;
	
	public ProfessorController(Class<T> persistedClass) {
		this.persistedClass = persistedClass;
	}
	
	public BackendFrontend sendErrorMessage(String message) {
		BackendFrontend bf = new BackendFrontend();
		bf.setSuccess(false);
		bf.setMessage(message);
		bf.setObject(null);
		bf.setList(null);
		System.out.println(message);
		return bf;
	}
		
	@SuppressWarnings("unchecked")
	BackendFrontend findAll() {					
		try {
			BackendFrontend bf = new BackendFrontend();
			List<T> list = GenericDAO.findAll(persistedClass);						
			bf.setObject(null);
			bf.setList((List<Object>)list);	
			bf.setSuccess(true);
			return bf;
		}
		catch (Exception e) {			
			return sendErrorMessage("Erro na busca: "+e.getMessage());			
		}		
	}	
	
	public BackendFrontend findById(@PathVariable Long id) {			
		try {			
			BackendFrontend bf = new BackendFrontend();
			T object = GenericDAO.findById(persistedClass, id);
			bf.setObject(object);
			bf.setList(null);
			bf.setSuccess(true);
			return bf;
		}
		catch (Exception e) {
			return sendErrorMessage("Erro na busca por código: "+e.getMessage());			
		}
	}
	
	public BackendFrontend save(T entity) {		
		try {
			BackendFrontend bf = new BackendFrontend();
			GenericDAO.save(entity);
			bf.setObject(entity);
			bf.setList(null);
			bf.setMessage("Persistência feita com sucesso!");
			bf.setSuccess(true);
			return bf;			
		}
		catch (Exception e) {
			return sendErrorMessage("Erro na persistência: "+e.getMessage());			
		}		
	}
		
	public BackendFrontend update(T entity) {		
		try {
			BackendFrontend bf = new BackendFrontend();	
			GenericDAO.update(entity);						
			bf.setObject(entity);
			bf.setList(null);	
			bf.setMessage("Atualização feita com sucesso!");
			bf.setSuccess(true);			
			return bf;		
		}
		catch (Exception e) {
			return sendErrorMessage("Erro na atualização: "+e.getMessage());			
		}
	}
		
	public BackendFrontend remove(Long id) {
		try {
			BackendFrontend bf = new BackendFrontend();
			T enitity = GenericDAO.findById(persistedClass, id);
			GenericDAO.delete(enitity);		
			bf.setObject(null);
			bf.setList(null);	
			bf.setMessage("Remoção feita com sucesso!");
			bf.setSuccess(true);			
			return bf;		
		}
		catch (Exception e) {
			return sendErrorMessage("Erro na remoção: "+e.getMessage());			
		}		
	}
}
