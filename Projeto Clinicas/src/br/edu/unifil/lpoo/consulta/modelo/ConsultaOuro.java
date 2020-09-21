package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta{
	private String tipo = "Ouro";
	public ConsultaOuro(String nome, String matricula, int dependentes, int anoInclusao, double valorConsulta) {
		super(nome, matricula, dependentes, anoInclusao, valorConsulta);
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorConsulta() {
		if(super.getAnoInclusao() <= 2000) {
			return 0;
		}
		return super.getValorConsulta() - (super.getValorConsulta()*0.3);
	}
}
