import java.util.ArrayList;
import java.util.List;

public class AgendaChipPlus implements IAgendaChipPlus {
	private List<Contato> agendacp;
	private List<Contato> favoritos;

	public AgendaChipPlus() {
		agendacp = new ArrayList<Contato>();
		favoritos = new ArrayList<Contato>();
	}

	public boolean adicionarContato(String nome, String telefone) {
		if (agendacp.size() > 5) {
			System.err.println("Nao cabem mais contatos!");
			return false;
		}

		if (testaDigito(telefone) == false) {
			System.err.println("Telefone errado, tem q ser apenas digitos!");
			return false;
		}

		else {
			agendacp.add(new Contato(nome, telefone));
			return true;
		}
	}

	public boolean atualizarContato(int id, String nome, String telefone) {
		for (Contato c : agendacp) {
			if(c.getId() == id) {
				c.setNome(nome);
				c.setTelefone(telefone);
				return true;
			}
		}

		return false;
	}

	public boolean removerContato(int id) {
		for (Contato c : agendacp)
			if (c.getId() == id) {
				agendacp.remove(c);
				return true;
			}
		return false;
	}

	public List<Contato> getContatos() {
		return agendacp;
	}

	public List<Contato> busca(String texto) {
		List<Contato> achados = new ArrayList<Contato>();
		for (Contato c : agendacp)
			if (c.getNome().contains(texto) || c.getTelefone().contains(texto))
				achados.add(c);
		return achados;
	}

	public boolean favoritar(int id) {
		for (Contato f : agendacp){
			if (f.getId() == id){
				favoritos.add(f);
				return true;
			}
		}
		return false;
	}

	public boolean desfavoritar(int id) {
		for (Contato f : agendacp){
			if (f.getId() == id){
				favoritos.remove(f);
				return true;
			}
		}
		return false;
	}
	public List<Contato> getFavoritos() {
		return favoritos;
	}

	// fun��o auxiliar para testar se a String recebida eh digito ou nao
	public boolean testaDigito(String a) {
		return true;
	}

}
