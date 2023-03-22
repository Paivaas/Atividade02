package br.senai.sp.jandira;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.println("Qual seu peso?(Em kg)");
		double peso = teclado.nextDouble();
		
		System.out.println("Qual sua altura?(Em metros)");
		double altura = teclado.nextDouble();
		
		double resultado = peso/Math.pow(altura, 2);
		
		System.out.println("Olá " + nome + "! Seu imc é " + resultado);

	}

}
