package ex1;

public class Padawan extends Jedi{
	private boolean ConstroiSabre;
	private boolean TemTrança;
	public Padawan(boolean Genêro, String Espécie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasão, boolean ConstroiSabre, boolean TemTrança) {
		super(Genêro, Espécie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuasão);
		this.ConstroiSabre = ConstroiSabre;
		this.TemTrança = TemTrança;
	}
	public boolean isConstroiSabre() {
		return ConstroiSabre;
	}
	public void setConstroiSabre(boolean constroiSabre) {
		ConstroiSabre = constroiSabre;
	}
	public boolean isTemTrança() {
		return TemTrança;
	}
	public void setTemTrança(boolean temTrança) {
		TemTrança = temTrança;
	}

}
