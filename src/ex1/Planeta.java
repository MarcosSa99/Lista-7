package ex1;

public class Planeta {
	private String Cor;
	private String Nome;
	private double Di�metro;
	private String Sistema; 
	private String Regime;
	public Planeta (String Cor, String Nome, double Di�metro, String Sistema, String Regime){
		this.Cor = Cor;
		this.Nome = Nome;
		this.Di�metro = Di�metro;
		this.Sistema = Sistema;
		this.Regime = Regime;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getDi�metro() {
		return Di�metro;
	}
	public void setDi�metro(double di�metro) {
		Di�metro = di�metro;
	}
	public String getSistema() {
		return Sistema;
	}
	public void setSistema(String sistema) {
		Sistema = sistema;
	}
	public String getRegime() {
		return Regime;
	}
	public void setRegime(String regime) {
		Regime = regime;
	}
	
}
