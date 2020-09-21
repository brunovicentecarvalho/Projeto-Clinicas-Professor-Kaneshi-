package br.edu.unifil.lpoo.consulta.controle;
import br.edu.unifil.lpoo.consulta.modelo.*;
import java.util.ArrayList;
public class CadastroDeConsultas {
	private ArrayList<Consulta> listaConsultas;
	public CadastroDeConsultas() {
		listaConsultas = new ArrayList();
	}
	public void incluiConsultas(Consulta auxConsulta, String tipo) {

		switch (tipo) {
		case "Ouro":
			listaConsultas.add(auxConsulta);
			break;
		case "Diamante":
			listaConsultas.add(auxConsulta);
			break;
		case "Prata":
			listaConsultas.add(auxConsulta);
			break;
		case "Familia":
			listaConsultas.add(auxConsulta);
			break;
		case "Consulta":
			listaConsultas.add(auxConsulta);
		}
	}
	public String exibeInformações(String tipo) {
		String saida = "";
		Consulta auxConsulta;
		for (int i = 0; i < listaConsultas.size(); i++) {
			auxConsulta = listaConsultas.get(i);
			if(auxConsulta.getTipo().equals(tipo)) {
				saida += "\n\n Nome: " + auxConsulta.getNome() + "\n Matricula: "
						+ auxConsulta.getMatricula();
			}
		}
		return saida;
	}
	public String exibeTodasConsultas() {
		String saida = "";
		String[] tipos = {"Prata", "Diamante", "Ouro", "Familia", "Consulta"};
		Consulta auxConsulta;
		for (int i = 0; i < tipos.length; i++) {
			saida += "\n\n Consultas " + tipos[i] +" :";
			for (int j = 0; j < listaConsultas.size(); j++) {
				auxConsulta = listaConsultas.get(j);
				if(auxConsulta.getTipo().equals(tipos[i])) {
					saida += "\n\n Nome : " + auxConsulta.getNome() +
							"\n Matricula :" + auxConsulta.getMatricula();
				}
			}
		}
		return saida;
	}
	public int totalConsultas(String tipo) {
		int total = 0;
		Consulta auxConsulta;
		for (int i = 0; i < listaConsultas.size(); i++) {
			auxConsulta = listaConsultas.get(i);
			if(auxConsulta.getTipo().equals(tipo)) {
				total += 1;
			}
		}
		return total;
	}
	public double totalValores(String tipo) {
		double valor = 0;
		Consulta auxConsulta;
		for (int i = 0; i < listaConsultas.size(); i++) {
			auxConsulta = listaConsultas.get(i);
			if(auxConsulta.getTipo().equals(tipo)) {
				valor += auxConsulta.getValorConsulta();
			}
		}
		return valor;
	}
}
