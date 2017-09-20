package br.com.bc.main;

import org.hibernate.Session;

import br.com.bc.model.Task;
import br.com.bc.tasklist.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		
		
Session session =HibernateUtil.getFactory().openSession();
		
		session.beginTransaction();
		Task  tk = new Task();
		
		tk.setNome("Tarefa1");
		tk.setDescricao("descricao da tarefa");
		
		
		System.out.println(tk.getNome());
		session.save(tk);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.getFactory().close();

	}

}
