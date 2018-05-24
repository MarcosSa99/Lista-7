package ex1;

public class Clâ {
	private String Lider;
	private String Nome;
	private String DataCriação;
	private String DataFim;
	public Clâ(String Lider, String Nome, String DataCriação, String DataFim) {
		this.Lider = Lider;
		this.Nome = Nome;
		this.DataCriação = DataCriação;
		this.DataFim = DataFim;
	}
	public String getLider() {
		return Lider;
	}
	public void setLider(String lider) {
		Lider = lider;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataCriação() {
		return DataCriação;
	}
	public void setDataCriação(String dataCriação) {
		DataCriação = dataCriação;
	}
	public String getDataFim() {
		return DataFim;
	}
	public void setDataFim(String dataFim) {
		DataFim = dataFim;
	}
}
