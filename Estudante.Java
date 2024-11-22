package interface_grafica;

public abstract class Estudante extends Pessoa{
	String matricula;
	
	public Estudante (String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
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

