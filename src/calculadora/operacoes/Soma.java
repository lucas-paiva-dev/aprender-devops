package calculadora.operacoes;

import calculadora.interfaces.operacoesInterface;

public class Soma implements operacoesInterface{

	@Override
	public double operacoes(double valorInicial, double valorFinal) {
		
		return valorInicial + valorFinal;
	}

	
	
}
