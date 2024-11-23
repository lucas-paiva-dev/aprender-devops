package calculadora.operacoes;

import calculadora.interfaces.operacoesInterface;

public class Dividir implements operacoesInterface {

	@Override
	public double operacoes(double valorInicial, double valorFinal) {
		if (valorFinal == 0) 
		{ throw new ArithmeticException("Divis�o por zero n�o � permitida"); }
		return valorInicial / valorFinal;
	}

}
