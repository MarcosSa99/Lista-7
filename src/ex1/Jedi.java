package ex1;

public abstract class Jedi extends SerVivo {

	private double PazInterna;
	private boolean Telepatia;
	private boolean Telecinese;
	private boolean Persuasao;
	public Jedi(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese, boolean Persuasao) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive);
	
		this.PazInterna = PazInterna;
		this.Telepatia = Telepatia;
		this.Telecinese = Telecinese;
		this.Persuasao = Persuasao;
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
		return Persuasao;
	}
	public void setPersuasão(boolean persuasão) {
		Persuasao = persuasão;
	}

}
