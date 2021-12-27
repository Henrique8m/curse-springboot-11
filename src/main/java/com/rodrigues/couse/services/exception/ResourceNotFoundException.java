package com.rodrigues.couse.services.exception;

//resource not found exception = recurso nao encontrado 
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//construtor padrão buscar o id do objeto para lançar a mensagem personalizada		
	public ResourceNotFoundException(Object id) {
		
		//construtor da super class
		super("Resource not found. id " + id);
		
	}

}
