package ex1;

public class Planeta {
	private String Cor;
	private String Nome;
	private double Diâmetro;
	private String Sistema; 
	private String Regime;
	public Planeta (String Cor, String Nome, double Diâmetro, String Sistema, String Regime){
		this.Cor = Cor;
		this.Nome = Nome;
		this.Diâmetro = Diâmetro;
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
	public double getDiâmetro() {
		return Diâmetro;
	}
	public void setDiâmetro(double diâmetro) {
		Diâmetro = diâmetro;
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
