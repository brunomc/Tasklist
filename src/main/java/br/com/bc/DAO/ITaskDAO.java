package br.com.bc.DAO;

import java.io.Serializable;
import java.util.List;

import br.com.bc.model.Task;



public interface ITaskDAO<E> extends Serializable {
	
	public void salvar(E entidade) throws Exception ;
	public void deletar(E entidade) throws Exception;
	public List<Task> buscar() throws Exception;
	
	

}
