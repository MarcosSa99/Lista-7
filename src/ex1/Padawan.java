package ex1;

public class Padawan extends Jedi{

	private boolean ConstroiSabreLuz;
	private boolean TemTrança;

	public Padawan(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, boolean ConstroiSabredeLuz, boolean TemTrança) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		this.setConstroiSabre(ConstroiSabredeLuz);
		this.setTemTrança(TemTrança);
	}
	
	public boolean isConstroiSabre() {
		return ConstroiSabreLuz;
	}
	public void setConstroiSabre(boolean constroiSabre) {
		ConstroiSabreLuz = constroiSabre;
	}
	public boolean isTemTrança() {
		return TemTrança;
	}
	public void setTemTrança(boolean temTrança) {
		TemTrança = temTrança;
	}

}
