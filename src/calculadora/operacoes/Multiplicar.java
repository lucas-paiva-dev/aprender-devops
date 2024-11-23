package calculadora.operacoes;

import calculadora.interfaces.operacoesInterface;

public class Multiplicar implements operacoesInterface {

	@Override
	public double operacoes(double valorInicial, double valorFinal) {
		
		return valorInicial * valorFinal;
	}
	
	

}
