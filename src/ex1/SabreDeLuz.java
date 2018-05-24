package ex1;

public class SabreDeLuz {
	private String Cor;
	private String Punho;
	public SabreDeLuz (String Cor, String Punho){
		this.Cor = Cor;
		this.Punho = Punho;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getPunho() {
		return Punho;
	}
	public void setPunho(String punho) {
		Punho = punho;
	}
}
