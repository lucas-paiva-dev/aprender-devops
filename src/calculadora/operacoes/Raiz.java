package calculadora.operacoes;

public class Raiz {
	
	public double raizQuadrada(double valor) 
	
	{ if (valor < 0) 
	
	{ throw new IllegalArgumentException("N�o � poss�vel calcular a raiz quadrada de um n�mero negativo."); } 
	
	return Math.sqrt(valor); }
}
