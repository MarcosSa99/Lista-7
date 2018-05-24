package ex1;

public class Mestre extends Jedi{
	private int CampoDeVid�ncia;
	private boolean Imortalidade; 
	
	public Mestre(boolean Gen�ro, String Esp�cie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuas�o) {
		super(Gen�ro, Esp�cie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuas�o);
	}
	public int getCampoDeVid�ncia() {
		return CampoDeVid�ncia;
	}
	public void setCampoDeVid�ncia(int campoDeVid�ncia) {
		CampoDeVid�ncia = campoDeVid�ncia;
	}
	public boolean isImortalidade() {
		return Imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		Imortalidade = imortalidade;
	}
}
