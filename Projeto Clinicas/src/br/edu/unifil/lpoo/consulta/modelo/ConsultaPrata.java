package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta{
	private String tipo = "Prata";
	public ConsultaPrata(String nome, String matricula, int dependentes, int anoInclusao, double valorConsulta) {
		super(nome, matricula, dependentes, anoInclusao, valorConsulta);
	}

	public String getTipo() {
		return tipo;
	}
	
	public double getValorConsulta() {
		return super.getValorConsulta() - (super.getValorConsulta()*0.2);
	}
}
