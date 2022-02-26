package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Insira o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma: "+ soma);
		System.out.println("Sub: "+subtracao);
		System.out.println("Divi: "+divisao);
		System.out.println("Multi: "+multiplicacao);
	}
	
	public static int soma (int a, int b) {
		return a+b;
	}
	public static int subtracao (int a, int b) {
		return a-b;
	}
	public static int divisao (int a, int b) {
		return a/b;
	}
	public static int multiplicacao (int a, int b) {
		return a*b;
	}

}
