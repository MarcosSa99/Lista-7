package ex1;

public class Padawan extends Jedi{
	private boolean ConstroiSabre;
	private boolean TemTran�a;
	public Padawan(boolean Gen�ro, String Esp�cie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuas�o, boolean ConstroiSabre, boolean TemTran�a) {
		super(Gen�ro, Esp�cie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuas�o);
		this.ConstroiSabre = ConstroiSabre;
		this.TemTran�a = TemTran�a;
	}
	public boolean isConstroiSabre() {
		return ConstroiSabre;
	}
	public void setConstroiSabre(boolean constroiSabre) {
		ConstroiSabre = constroiSabre;
	}
	public boolean isTemTran�a() {
		return TemTran�a;
	}
	public void setTemTran�a(boolean temTran�a) {
		TemTran�a = temTran�a;
	}

}
