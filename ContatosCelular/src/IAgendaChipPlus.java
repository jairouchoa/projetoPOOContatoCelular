import java.util.List;

public interface IAgendaChipPlus extends IAgendaChip {

	public abstract boolean favoritar(int id);
	public abstract boolean desfavoritar(int id);
	public abstract List<Contato> getFavoritos();
}
