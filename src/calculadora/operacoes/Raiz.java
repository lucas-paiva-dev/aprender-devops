package calculadora.operacoes;

public class Raiz {
	
	public double raizQuadrada(double valor) 
	
	{ if (valor < 0) 
	
	{ throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo."); } 
	
	return Math.sqrt(valor); }
}
