package br.com.nutri.controller;

import br.com.nutri.model.Constantes;
import br.com.nutri.model.Paciente;

public class Calculos {
	Paciente paciente = new Paciente();
	float tmbGestante;
	float resultadoVet;
	float calculoIMC;
	String classificacaoIMC;
	
	public float tmbGestante(float peso){
		tmbGestante = (float) (Constantes.TMBGESTANTE * peso + 486.6);
		return tmbGestante;
	}
	
	public float vetGestante(int valorAtividadeFisica){
		if (valorAtividadeFisica == 1)
			resultadoVet = tmbGestante * Constantes.SEDENTARIO;

		if (valorAtividadeFisica == 2)
			resultadoVet = tmbGestante * Constantes.MODERADO;

		if (valorAtividadeFisica == 3)
			resultadoVet = tmbGestante * Constantes.VIGOROSO;

		return resultadoVet;
	}
	
	public float pesoIdealFeminino(float altura){
		float pesoIdeal = Constantes.METRICAPESOIDEALFEMININO * (altura * altura);
		return pesoIdeal;
	}
	
	public float pesoIdealMasculino(float altura){
		float pesoIdeal = Constantes.METRICAPESOIDEALMASCULINO * (altura * altura);
		return pesoIdeal;
	}
	
	public float calculoIMC(float peso, float altura){
		calculoIMC = peso / (altura * altura);
		return calculoIMC;
	}
	
	public String classificacaoIMC(){
		if(calculoIMC < 18.5)
			classificacaoIMC = "Desnutrido";
		if(calculoIMC >= 18.5 && calculoIMC <= 24.9)
			classificacaoIMC = "Eutrofica";
		if(calculoIMC >= 25 && calculoIMC <= 29.9)
			classificacaoIMC = "Sobrepeso";
		if(calculoIMC >= 30 && calculoIMC <= 34.9)
			classificacaoIMC = "Obesidade Grau 1";
		if(calculoIMC >= 35 && calculoIMC <= 39.9)
			classificacaoIMC = "Obesidade Grau 2";
		if(calculoIMC >= 40)
			classificacaoIMC = "Obesidade Grau 3";
		
		return classificacaoIMC;
	}
	
	
}
