package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AulaVetor {

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		float[] tempVetor = new float[30];
		String[] dataVetor = new String[30];
		String condicao = "n";
		boolean liberar = false;
		String data = new String();
		int i = -1;
		int j = -1;
		
		do {
				
				liberar = true;
				System.out.println("Digite data: ");
				data = scan.nextLine();
				
				for(i=0; i < dataVetor.length; i++) {
					boolean ehIgual = data.equals(dataVetor[i]);
					if(ehIgual) { 
						System.out.println("Data ja informada");
						liberar = false;
						break;
					} 
					
				}
					
				if(liberar == true) {
					j++;
					dataVetor[j] = data;
					System.out.println("Digite a temperatura: ");
					tempVetor[j] = Float.parseFloat(scan.nextLine()); 
				}
				
				
				System.out.println("Deseja continuar (s/n): ");
				condicao = scan.nextLine();
				
				
			} while (condicao.equals("s"));
		
		
	}

}
