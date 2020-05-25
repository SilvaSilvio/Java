package model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BackendFrontend {
	private Boolean success;
	private String message;
	private Object object;
	private List<Object> list;	
//NÃO E SALVO NO BANCO, SERVE APENAS PARA TRANSFERIR ENTRE SERVIDOR E CLIENTE.
}
