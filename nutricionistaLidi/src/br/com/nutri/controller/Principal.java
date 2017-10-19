package br.com.nutri.controller;

import java.util.Scanner;

import br.com.nutri.model.Paciente;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Paciente paciente = new Paciente();
		Calculos calc = new Calculos();
		
		System.out.println("Digite o nome: ");
		paciente.setNome(scan.nextLine());
				
		System.out.println("Digite altura: ");
		float altura = Float.parseFloat(scan.nextLine());
		System.out.println("Digite peso: ");
		float peso = Float.parseFloat(scan.nextLine());
		System.out.println("Atividade Fisica");
		System.out.println("Digite 1-Sedentario / 2-Moderado / 3-Vigoroso");
		int atividade = Integer.parseInt(scan.nextLine());
		
		
			
		System.out.println("Calculo do IMC: " + calc.calculoIMC(peso, altura));
		System.out.println("Classificacao IMC: " + calc.classificacaoIMC());
		System.out.println("Peso Ideal: " + calc.pesoIdealFeminino(altura));
		System.out.println("TMB Gestante: " + calc.tmbGestante(peso));
		System.out.println("VET: " + calc.vetGestante(atividade));
		

	}

}
