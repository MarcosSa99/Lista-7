package ex1;

public class Cavaleiro extends Jedi{
	String DataPromoção;
	public Cavaleiro(boolean Genêro, String Espécie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasão,String DataPromoção) {
		super(Genêro, Espécie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuasão);
		this.DataPromoção = DataPromoção;
	}
	public String getDataPromoção() {
		return DataPromoção;
	}
	public void setDataPromoção(String dataPromoção) {
		DataPromoção = dataPromoção;
	}
	
}
