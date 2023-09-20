package collectionJava.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	//atributo
	private List<Tarefa>tarefaList;
	
	public ListaTarefa() {
	    this.tarefaList = new ArrayList<>();
	  }

	//metodos
	  public void adicionarTarefa(String descricao) { //Adiciona uma nova tarefa à lista com a descrição fornecida.
	    tarefaList.add(new Tarefa(descricao));
	  }

	  public void removerTarefa(String descricao) { //Remove uma tarefa da lista com base em sua descrição.
	    List<Tarefa> tarefasParaRemover = new ArrayList<>();
	    if (!tarefaList.isEmpty()) {
	      for (Tarefa t : tarefaList) {
	        if (t.getDescricao().equalsIgnoreCase(descricao)) {
	          tarefasParaRemover.add(t);
	        }
	      }
	      tarefaList.removeAll(tarefasParaRemover);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

	  public int obterNumeroTotalTarefas() {//Retorna o número total de tarefas na lista.
	    return tarefaList.size();
	  }

	  public void obterDescricoesTarefas() {//Retorna uma lista contendo a descrição de todas as tarefas na lista.
	    if (!tarefaList.isEmpty()) {
	      System.out.println(tarefaList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

	  public static void main(String[] args) {
	    ListaTarefa listaTarefa = new ListaTarefa();
	    System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

	    listaTarefa.adicionarTarefa("Tarefa 1");
	    listaTarefa.adicionarTarefa("Tarefa 1");
	    listaTarefa.adicionarTarefa("Tarefa 2");
	    System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

	    listaTarefa.removerTarefa("Tarefa 1");
	    System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

	    listaTarefa.obterDescricoesTarefas();
	  }
	}