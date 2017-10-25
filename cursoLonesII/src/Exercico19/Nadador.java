package Exercico19;

public class Nadador {
	int Idade;
	String categoria;

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}
	
	
	public String categoria(int idade){
		if(idade >= 5 && idade <=7)
			categoria = "Infantil A"; 
		
		if(idade >= 8 && idade <=10)
			categoria = "Infantil B";
		
		if(idade >= 11 && idade <=13)
			categoria = "Juvenil A";
		
		if(idade >= 14 && idade <=17)
			categoria = "Juvenil B";
		
		if(idade > 18)
			categoria = "Adulto";
		
		return categoria;
	}

}
