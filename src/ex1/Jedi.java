package ex1;

public abstract class Jedi extends SerVivo {
	private double PazInterna;
	private boolean Telepatia;
	private boolean Telecinese;
	private boolean Persuasão;
	private double CampoDeVidencia;
	public Jedi(boolean Genêro, String Espécie, String DataNascimento, boolean Alive, String Nome, String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese, boolean Persuasão, double CampoDeVidencia) {
		super(Genêro, Espécie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians);
		this.PazInterna = PazInterna;
		this.Telepatia = Telepatia;
		this.Telecinese = Telecinese;
		this.Persuasão = Persuasão;
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
	public boolean isPersuasão() {
		return Persuasão;
	}
	public void setPersuasão(boolean persuasão) {
		Persuasão = persuasão;
	}
	public double getCampoDeVisão() {
		return CampoDeVisão;
	}
	public void setCampoDeVisão(double campoDeVisão) {
		CampoDeVisão = campoDeVisão;
	}

}
