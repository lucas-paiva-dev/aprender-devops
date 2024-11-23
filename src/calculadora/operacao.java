package calculadora;

import calculadora.operacoes.Dividir;
import calculadora.operacoes.Multiplicar;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtrair;
import java.util.Scanner;

public class operacao {

	public static void main(String[] args) {
		
		Soma soma = new Soma(); 
		Subtrair subtrair = new Subtrair(); 
		Multiplicar multiplicar = new Multiplicar(); 
		Dividir dividir = new Dividir();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor inicial: ");
		double valorInicial = scanner.nextDouble();
		
		System.out.print("Digite o valor final: "); 
		double valorFinal = scanner.nextDouble();

		double resultadoSoma = soma.operacoes(valorInicial, valorFinal); 
		double resultadoSubtrair = subtrair.operacoes(valorInicial, valorFinal); 
		double resultadoMultiplicar = multiplicar.operacoes(valorInicial, valorFinal); 
		double resultadoDividir = dividir.operacoes(valorInicial, valorFinal);
		
		System.out.println("A soma é: " + resultadoSoma);
		System.out.println("A subtração é: " + resultadoSubtrair); 
		System.out.println("A multiplicação é: " + resultadoMultiplicar); 
		System.out.println("A divisão é: " + resultadoDividir);
		
		scanner.close();
		
	}

}
