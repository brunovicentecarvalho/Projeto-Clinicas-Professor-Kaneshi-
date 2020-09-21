package br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
	private String nome;
	private String matricula;
	protected int dependentes;
	protected int anoInclusao;
	protected double valorConsulta;
	private String tipo = "Consulta";
	public Consulta(String nome, String matricula, int dependentes, int anoInclusao, double valorConsulta) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setDependentes(dependentes);
		this.setAnoInclusao(anoInclusao);
		this.setValorConsulta(valorConsulta);
	}
	public String getTipo() {
		return tipo;
	};
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if(matricula.length() == 5) {
		this.matricula = matricula;
		return;
		} 
		throw new Error("Matricula Invalida");
	}
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public int getAnoInclusao() {
		return anoInclusao;
	}
	public void setAnoInclusao(int anoInclusao) {
		this.anoInclusao = anoInclusao;
	}
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
}
