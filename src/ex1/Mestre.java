package ex1;

public class Mestre extends Jedi{
	private int CampoDeVidência;
	private boolean Imortalidade; 
	
	public Mestre(boolean Genêro, String Espécie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasão) {
		super(Genêro, Espécie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuasão);
	}
	public int getCampoDeVidência() {
		return CampoDeVidência;
	}
	public void setCampoDeVidência(int campoDeVidência) {
		CampoDeVidência = campoDeVidência;
	}
	public boolean isImortalidade() {
		return Imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		Imortalidade = imortalidade;
	}
}
