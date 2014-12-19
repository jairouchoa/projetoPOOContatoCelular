
public class Contato implements IContato{
	int id;
	String nome;
	String telefone;

	public Contato(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTelefone(String telefoneNovo){
		this.telefone = telefoneNovo;
	}

	public String getTelefone() {
		return this.telefone;
	}

}
