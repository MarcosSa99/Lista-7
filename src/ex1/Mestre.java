package ex1;

public class Mestre extends Jedi{

	private int CampoDeVidencia;
	private boolean Imortalidade; 
	
	public Mestre(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, int CampodeVidencia, boolean Imortalidade) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		
		this.setCampoDeVidência(CampodeVidencia);
		this.setImortalidade(Imortalidade);
		
	}
	
	public int getCampoDeVidência() {
		return CampoDeVidencia;
	}
	public void setCampoDeVidência(int campoDeVidência) {
		CampoDeVidencia = campoDeVidência;
	}
	public boolean isImortalidade() {
		return Imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		Imortalidade = imortalidade;
	}
}
