package calculadora;

import calculadora.operacoes.Dividir;
import calculadora.operacoes.Multiplicar;
import calculadora.operacoes.Raiz;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtrair;
import java.util.Scanner;

public class operacao {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		Soma soma = new Soma(); 
		Subtrair subtrair = new Subtrair(); 
		Multiplicar multiplicar = new Multiplicar(); 
		Dividir dividir = new Dividir();
		Raiz raiz = new Raiz ();
		
		Scanner scanner = new Scanner(System.in);
		
		while (continuar) {
		System.out.print("1 para raiz, 2 para somar, 3 para subtrair, 4 para mult, 5 para dividir ");
		int escolha = scanner.nextInt();
		
		if (escolha==1)
		
		{
		System.out.print ("digite o valor da raiz");
		
		double valor = scanner.nextDouble();
		
		double resultadoRaiz = raiz.raizQuadrada(valor);
		
		System.out.println("A raiz é: " + resultadoRaiz);
		}
		
		else if (escolha ==2)
			
		{
			System.out.print("Digite o valor inicial: ");
			double valorInicial = scanner.nextDouble();
			
			System.out.print("Digite o valor final: "); 
			double valorFinal = scanner.nextDouble();
			
			double resultadoSoma = soma.operacoes(valorInicial, valorFinal);
			
			System.out.println("A soma é: " + resultadoSoma);
		}
		
		else if (escolha ==3)
			
		{
			System.out.print("Digite o valor inicial: ");
			double valorInicial = scanner.nextDouble();
			
			System.out.print("Digite o valor final: "); 
			double valorFinal = scanner.nextDouble();
			
			double resultadoSubtrair = subtrair.operacoes(valorInicial, valorFinal);
			
			System.out.println("A subtração é: " + resultadoSubtrair); 
		}
		
		else if (escolha==4)
			
		{
			System.out.print("Digite o valor inicial: ");
			double valorInicial = scanner.nextDouble();
			
			System.out.print("Digite o valor final: "); 
			double valorFinal = scanner.nextDouble();
			
			double resultadoMultiplicar = multiplicar.operacoes(valorInicial, valorFinal);
		}
		 
		else if (escolha==5) 
			
		{
			System.out.print("Digite o valor inicial: ");
			double valorInicial = scanner.nextDouble();
			
			System.out.print("Digite o valor final: "); 
			double valorFinal = scanner.nextDouble();
			
			double resultadoDividir = dividir.operacoes(valorInicial, valorFinal);
			
			System.out.println("A divisão é: " + resultadoDividir);
			
			
		}
		
		System.out.print("Deseja realizar outra operação? (s/n): "); 
		String resposta = scanner.next(); 
		if (!resposta.equalsIgnoreCase("s")) 
		{ continuar = false; }
		}
		
		
		
	
		
		scanner.close();
		
	}

}
