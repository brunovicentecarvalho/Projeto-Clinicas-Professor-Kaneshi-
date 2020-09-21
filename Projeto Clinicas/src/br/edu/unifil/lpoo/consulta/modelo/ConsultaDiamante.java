package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta{
	private String tipo = "Diamante";
	public ConsultaDiamante(String nome, String matricula, int dependentes, int anoInclusao, double valorConsulta) {
		super(nome, matricula, dependentes, anoInclusao, valorConsulta);
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorConsulta() {
		return super.getValorConsulta() - (super.getValorConsulta()*0.4);
	}
}
