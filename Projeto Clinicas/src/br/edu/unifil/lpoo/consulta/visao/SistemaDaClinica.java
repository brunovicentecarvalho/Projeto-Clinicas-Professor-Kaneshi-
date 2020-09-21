package br.edu.unifil.lpoo.consulta.visao;
import br.edu.unifil.lpoo.consulta.*;
import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.Scanner;
public class SistemaDaClinica {
	
	public static void main(String[] args) {
	String nome = "", matricula = "", tipo;
	int dependentes= 0, anoInclusao = 0;
	double valorConsulta=0;
	CadastroDeConsultas cdr = new CadastroDeConsultas();
	Consulta consulta;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Sistema de Cadastro de Consultas");
	int a=0, b=0;
		while(a!=9) {
		System.out.println("\n1-Nova Consulta");
		System.out.println("2-Informações consultas");
		System.out.println("9- Sair sistema");
		a = leia.nextInt();
			switch (a) {
			case 1:
				while(b!=9) {
					
					System.out.println("");
					System.out.println("1- Consulta Prata");
					System.out.println("2- Consulta Ouro");
					System.out.println("3- Consulta Diamante");
					System.out.println("4- Consulta Familia");
					System.out.println("5- Consulta(Sem plano)");
					System.out.println("9- Sair cadastramento");
					b = leia.nextInt();
					if(b != 9) {
						System.out.print("Nome :");
						nome = leia.next();
						System.out.print("Matricula :");
						matricula = leia.next();
						System.out.print("Dependentes :");
						dependentes = leia.nextInt();
						System.out.print("Ano Inclusão :");
						anoInclusao = leia.nextInt();
						System.out.print("Valor Consulta :");
						valorConsulta = leia.nextDouble();
					}
					switch (b) {
					case 1:
						consulta = new ConsultaPrata(nome, matricula, dependentes, anoInclusao, valorConsulta);
						cdr.incluiConsultas(consulta, consulta.getTipo());
						break;
					case 2: 
						consulta = new ConsultaOuro(nome, matricula, dependentes, anoInclusao, valorConsulta);
						cdr.incluiConsultas(consulta, consulta.getTipo());
						break;
					case 3:
						consulta = new ConsultaDiamante(nome, matricula, dependentes, anoInclusao, valorConsulta);
						cdr.incluiConsultas(consulta, consulta.getTipo());
						break;
					case 4:
						consulta = new ConsultaFamilia(nome, matricula, dependentes, anoInclusao, valorConsulta);
						cdr.incluiConsultas(consulta, consulta.getTipo());
						break;
					case 5:
						consulta = new Consulta(nome, matricula, dependentes, anoInclusao, valorConsulta);
						cdr.incluiConsultas(consulta, consulta.getTipo());
						break;
					}
				}
				b = 0;
				break;
			case 2:
				while(b!=9) {
					System.out.println();
					System.out.println("1- Exibir todas as consultas");
					System.out.println("2- Exibir consultas de um tipo especifíco");
					System.out.println("3- Total de consultas de um tipo");
					System.out.println("4- Total de valores das consultas de um tipo");
					System.out.println("9- Sair do menu de informações");
					b = leia.nextInt();
					switch (b) {
					case 1:
						System.out.println(cdr.exibeTodasConsultas());
						break;
					case 2:
						System.out.println("Tipo requerido :");
						tipo = leia.next();
						System.out.println(cdr.exibeInformações(tipo));
						break;
					case 3:
						System.out.println("Tipo Requerido: ");
						tipo = leia.next();
						System.out.println("Numero total de consultas : "+cdr.totalConsultas(tipo));
						break;
					case 4: 
						System.out.println("Tipo Requerido: ");
						tipo = leia.next();
						System.out.println("Total de reais : R$"+cdr.totalValores(tipo));
						break;
					}
				}
				b=0;
				break;
			}
		}
		System.out.println("\nSaída do sistema concluida com sucesso");
	}
}
