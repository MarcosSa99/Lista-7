package ex1;

public class Youngling extends Jedi{
	private String cl�;
	private boolean ColetaDeCristais;
	public Youngling(boolean Gen�ro, String Esp�cie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuas�o) {
		super(Gen�ro, Esp�cie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuas�o);
	}
	public String getCl�() {
		return cl�;
	}
	public void setCl�(String cl�) {
		this.cl� = cl�;
	}
	public boolean isColetaDeCristais() {
		return ColetaDeCristais;
	}
	public void setColetaDeCristais(boolean coletaDeCristais) {
		ColetaDeCristais = coletaDeCristais;
	}
	
}
