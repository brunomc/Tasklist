package br.com.bc.bean;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.bc.DAO.TaskDAO;
import br.com.bc.model.Task;
@SessionScoped
@ManagedBean
public class TaskBean {
	
	private Task  task = new Task();
	private List<Task> tasklist = new ArrayList<>();

	
	



	public Task getTask() {
		return task;
	}



	public void setTask(Task task) {
		this.task = task;
	}



	public void salvar() {
		
		System.out.println(task.getNome());
		System.out.println(task.getDescricao());
		System.out.println(task.getStatus());
		TaskDAO td = new TaskDAO();
		td.salvar(task);
		
		
	}
	public void deletar(Task  tsk) {
		
		TaskDAO td = new TaskDAO();
		td.deletar(tsk);
		
	}
public List<Task> buscar() throws Exception {
		TaskDAO td = new TaskDAO();
		tasklist = td.buscar();
		
		return tasklist;
	
	}

   public void limpar() {
	   task = new Task();
   }

	public List<Task> getTasklist() {
		return tasklist;
	}



	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	};
}
