import java.util.List;

public interface IAgendaChip {
	
	public boolean adicionarContato(String nome, String telefone);
	public boolean atualizarContato(int id, String nome, String telefone);
	public boolean removerContato(int id);
	
	public List<Contato> getContatos();
	public List<Contato> busca(String texto);
}
