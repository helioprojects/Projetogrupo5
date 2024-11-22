package interface_grafica;

public abstract class Professor extends Pessoa{

	String especialidade;
	
	public Professor(String nome, int idade, String especialidade) {
		super(nome, idade);
		this.especialidade = especialidade;
	}
	 public void login() {
	    	System.out.println();
	    }
	   
	    public void edition() {
	    	System.out.println();
	    }

	    public void exclusion() {
	    	System.out.println();
        }
}
