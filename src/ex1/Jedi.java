package ex1;

public abstract class Jedi extends SerVivo {
	private double PazInterna;
	private boolean Telepatia;
	private boolean Telecinese;
	private boolean Persuas�o;
	private double CampoDeVidencia;
	public Jedi(boolean Gen�ro, String Esp�cie, String DataNascimento, boolean Alive, String Nome, String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese, boolean Persuas�o, double CampoDeVidencia) {
		super(Gen�ro, Esp�cie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians);
		this.PazInterna = PazInterna;
		this.Telepatia = Telepatia;
		this.Telecinese = Telecinese;
		this.Persuas�o = Persuas�o;
		this.CampoDeVidencia = CampoDeVidencia;
	}
	public double getPazInterna() {
		return PazInterna;
	}
	public void setPazInterna(double pazInterna) {
		PazInterna = pazInterna;
	}
	public boolean isTelepatia() {
		return Telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		Telepatia = telepatia;
	}
	public boolean isTelecinese() {
		return Telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		Telecinese = telecinese;
	}
	public boolean isPersuas�o() {
		return Persuas�o;
	}
	public void setPersuas�o(boolean persuas�o) {
		Persuas�o = persuas�o;
	}
	public double getCampoDeVis�o() {
		return CampoDeVis�o;
	}
	public void setCampoDeVis�o(double campoDeVis�o) {
		CampoDeVis�o = campoDeVis�o;
	}

}
