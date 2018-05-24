package ex1;

public class Cavaleiro extends Jedi{
	
	String DataPromoção;
	
	public Cavaleiro(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, String DataPromocao) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		this.setDataPromoção(DataPromocao);
	}

	public String getDataPromoção() {
		return DataPromoção;
	}
	public void setDataPromoção(String dataPromoção) {
		DataPromoção = dataPromoção;
	}
	
}
