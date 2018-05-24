package ex1;

public class Youngling extends Jedi{
	private String clã;
	private boolean ColetaDeCristais;
	public Youngling(boolean Genêro, String Espécie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasão) {
		super(Genêro, Espécie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuasão);
	}
	public String getClã() {
		return clã;
	}
	public void setClã(String clã) {
		this.clã = clã;
	}
	public boolean isColetaDeCristais() {
		return ColetaDeCristais;
	}
	public void setColetaDeCristais(boolean coletaDeCristais) {
		ColetaDeCristais = coletaDeCristais;
	}
	
}
