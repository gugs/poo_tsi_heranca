package org.heranca.tsi.app.model;

import java.util.Date;

public class Paciente {

	String cpf;
	float peso;
	float altura;
	char sexo;
	int idade;
	
	
	public Paciente(String cpf, float peso, float altura, char sexo, int idade) {
		super();
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", idade=" + idade
				+ "]";
	}
	
	
	public float calcularIMC() {
		return peso/(altura*altura);
	}
	
	public float calcularMetabolismoBasal() {
		if(sexo == 'M') {
			if(idade>=0 && idade < 3)
				return (60.9f*peso)-54;
			else if(idade>=3 && idade < 10)
				return (22.7f*peso)+495;
			else
				return  (17.5f*peso)+651;
		}else
		{
			if(idade>=0 && idade < 3)
				return (61.0f*peso)-51;
			else if(idade>=3 && idade < 10)
				return (22.5f*peso)+499;
			else
				return  (12.2f*peso)+746;
		}
	}
	
	
}
