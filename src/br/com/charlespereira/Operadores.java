package br.com.charlespereira;

public class Operadores {
	
	public static void main(String args[]) {
		operacoesAritmeticas();
		operacoesAtribuicoes();
		operacoesIncrementoDecremento();
		operadoresRelacionais();
		operadoresLogicos();
	}
	
	private static void operadoresLogicos() {
		System.out.println("****operadoresLogicos****");
		int numero1 = 10;
		int numero2 = 10;
		boolean isDentro10 = numero1 >= 1 && numero2 <=10;
		System.out.println(isDentro10);
		boolean isDentro_10 = numero1 >= 50 || numero2 <=10;
		System.out.println(isDentro_10);
	}

	private static void operadoresRelacionais() {
		System.out.println("****operadoresRelacionais****");
		int numero1 = 10;
		int numero2 = 10;
		boolean isMaior = numero1 <= numero2;
		System.out.println(isMaior);
	}

	private static void operacoesIncrementoDecremento() {
		System.out.println("****operacoesIncrementoDecremento****");
		int num1 = 10;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		
		
	}

	private static void operacoesAtribuicoes() {
		System.out.println("****operacoesAtribuicoes****");
		int numero1 = 10;
		int numero2 = 10;
		int numero3 = numero1 + numero2;
		System.out.println(numero3);
		numero3 += numero3;
		System.out.println(numero3);
		
	}

	public static void operacoesAritmeticas( ) {
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		int num4 = num1 / num2;
		System.out.println(num3);
		System.out.println(num4);
	}
	
	
}
