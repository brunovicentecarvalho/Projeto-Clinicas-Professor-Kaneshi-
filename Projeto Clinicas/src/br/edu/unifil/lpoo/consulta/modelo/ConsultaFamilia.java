package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {
	private String tipo = "Familia";
	public ConsultaFamilia(String nome, String matricula, int dependentes, int anoInclusao, double valorConsulta) {
		super(nome, matricula, dependentes, anoInclusao, valorConsulta);
	}
	public String getTipo() {
		return tipo;
	}

	public double getValorConsulta() {
		if(super.getDependentes() > 2) {
			return super.getValorConsulta()/2;
		}
		return super.getValorConsulta();
	}
}
