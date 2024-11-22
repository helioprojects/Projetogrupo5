package interface_grafica;

public abstract class Pessoa {

	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public abstract void login();
    	
    public abstract void edition();

    public abstract void exclusion();
	
   
    public String toString() {
		
		return "Nome: " + nome +
				"Idade: " + idade;
	}
	
}
