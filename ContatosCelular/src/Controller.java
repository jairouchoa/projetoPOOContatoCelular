public class Controller {

	public static void testeAgendaChip(IAgendaChip agenda) {
		agenda.adicionarContato("Carlos", "32259608");
		agenda.adicionarContato("Carlos", "87448547");
		agenda.adicionarContato("Marcos", "32259607");
		agenda.adicionarContato("Cesaro", "32259606");
		agenda.adicionarContato("Mariana", "32259605");
		
		System.out.println("Teste de tamanho:");
		System.out.println(agenda.getContatos().size() == 5);
		
		IContato contato = agenda.busca("Marcos").get(0);
		agenda.atualizarContato(contato.getId(), "Marquinhos", "32222222");

		System.out.println("Teste de busca 1:");
		System.out.println(agenda.busca("Carlos").size() == 2);
		
		System.out.println("Teste de busca 2:");
		System.out.println(agenda.busca("8547").size() > 0 && agenda.busca("8547").get(0).getNome().equals("Carlos"));
		
		System.out.println("Teste de busca 3:");
		System.out.println(agenda.busca("<padrão inexistente>").size() == 0);
		
		System.out.println("Teste de busca 4:");
		System.out.println(agenda.busca("222222").size() > 0 && agenda.busca("222222").get(0).getNome().equals("Marquinhos"));

		System.out.println("Teste de remocao 1:");
		System.out.println(agenda.removerContato(agenda.busca("9605").get(0).getId()) == true);
		
		System.out.println("Teste de busca 5:");
		System.out.println(agenda.busca("Mariana").size() == 0);
		
		System.out.println("Teste de remocao 2:");
		System.out.println(agenda.removerContato(500) == false);
	}

	public static void testeAgendaPlus(IAgendaChipPlus agendacp) {
		testeAgendaChip(agendacp);

		int size = agendacp.getContatos().size();
		agendacp.favoritar(agendacp.getContatos().get(0).getId());
		agendacp.favoritar(agendacp.getContatos().get(0).getId());
		agendacp.favoritar(agendacp.getContatos().get(0).getId());
		agendacp.favoritar(agendacp.getContatos().get(size - 1).getId());
		System.out.println("Teste favoritar:");
		System.out.println(agendacp.getFavoritos().size() == 2);
	}

	public static void main(String[] args) {
		// passe uma agenda vazia por parametro
		AgendaChip ac = new AgendaChip();
		testeAgendaChip(ac);

		// passe uma agendaplus vazia por parametro
		AgendaChipPlus acp = new AgendaChipPlus();
		testeAgendaPlus(acp);
	}
}
