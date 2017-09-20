package br.com.bc.DAO;



import java.util.List;


import org.hibernate.Session;

import br.com.bc.model.Task;
import br.com.bc.tasklist.util.HibernateUtil;

public class TaskDAO implements ITaskDAO<Task> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Task> tasklist;
	
	@Override
	public void salvar(Task task) {
		
		try {
			Session session =HibernateUtil.getFactory().openSession();
			
			session.beginTransaction();
		
			System.out.println(task.getNome());
			session.save(task);
			
			session.getTransaction().commit();
			session.close();
			
			
		} catch (Exception e) {
			System.out.println("Não foi possivel salvar");
		}
		
	}

	@Override
	public void deletar(Task task) {
		try {
				Session session =HibernateUtil.getFactory().openSession();
			
			session.beginTransaction();
		
			System.out.println(task.getNome());
			session.delete(task);
			
			session.getTransaction().commit();
			session.close();
			
			
		} catch (Exception e) {
			System.out.println("Não foi possivel deletar");
		}
		
	}
	@Override
	public void alteraStatus(Task task) {
		try {
				Session session =HibernateUtil.getFactory().openSession();
			
			session.beginTransaction();
		
			System.out.println(task.getNome());
			
			
			session.update(task);
			session.getTransaction().commit();
			session.close();
			
			
		} catch (Exception e) {
			System.out.println("Não foi possivel deletar");
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
    public List<Task> buscar() {
		try {
			Session session =HibernateUtil.getFactory().openSession();
			
			session.beginTransaction();
	             tasklist= session.createQuery("FROM " + Task.class.getName()).getResultList();
	             session.close();
	  			
		} catch (Exception e) {
			 System.out.println("Não foi possivel listar"+e);
			
		}
		return tasklist;
    }

	

}
