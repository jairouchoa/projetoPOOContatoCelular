import java.util.ArrayList;
import java.util.List;

public class AgendaChip implements IAgendaChip{
	private List<Contato> agendac;

	public AgendaChip(){
		agendac = new ArrayList<Contato>();
	}

	public boolean adicionarContato(String nome, String telefone) {
		if ((int)agendac.size() > 5){
			System.err.println("Nao cabem mais contatos!");
			return false;
		}

		else{
			agendac.add(new Contato(nome, telefone));
			return true;
		}
	}

	public boolean atualizarContato(int id, String nome, String telefone) {
		for (Contato c : agendac) {
			if(c.getId() == id) {
				c.setNome(nome);
				c.setTelefone(telefone);
				return true;
			}
		}

		return false;
	}

	public boolean removerContato(int id) {
		for (Contato c : agendac)
			if (c.getId() == id) {
				agendac.remove(c);
				return true;
			}
		return false;
	}

	public List<Contato> getContatos() {
		return agendac;
	}

	public List<Contato> busca(String texto) {
		List<Contato> achados = new ArrayList<Contato>();
		for (Contato c : agendac)
			if (c.getNome().contains(texto) || c.getTelefone().contains(texto))
				achados.add(c);
		return achados;
	}
}
