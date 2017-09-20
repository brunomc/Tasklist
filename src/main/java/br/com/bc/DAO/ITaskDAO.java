package br.com.bc.DAO;

import java.io.Serializable;
import java.util.List;





public interface ITaskDAO<E> extends Serializable {
	
	public void salvar(E entidade) throws Exception ;
	public void deletar(E entidade) throws Exception;
	public List<E> buscar() throws Exception;
	public void alteraStatus(E entidade);
	
	

}
