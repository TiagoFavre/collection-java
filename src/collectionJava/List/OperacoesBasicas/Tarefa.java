package collectionJava.List.OperacoesBasicas;

public class Tarefa {
	
	 //atributo
	  private String descricao;

	  public Tarefa(String descricao) { //construtor
	    this.descricao = descricao;
	  }

	  public String getDescricao() { 
	    return descricao;
	  }

	  @Override
	  public String toString() {
	    return  descricao;
	  }
	}