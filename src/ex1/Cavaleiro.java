package ex1;

public class Cavaleiro extends Jedi{
	String DataPromo��o;
	public Cavaleiro(boolean Gen�ro, String Esp�cie, String DataNascimento, boolean Alive, String Nome,
			String PlanetaNatal, int MidChlorians, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuas�o,String DataPromo��o) {
		super(Gen�ro, Esp�cie, DataNascimento, Alive, Nome, PlanetaNatal, MidChlorians, PazInterna, Telepatia, Telecinese,
				Persuas�o);
		this.DataPromo��o = DataPromo��o;
	}
	public String getDataPromo��o() {
		return DataPromo��o;
	}
	public void setDataPromo��o(String dataPromo��o) {
		DataPromo��o = dataPromo��o;
	}
	
}
