package org.heranca.tsi.app.model;

import java.util.Date;

public class PacienteMasculino extends Paciente{

	Date andropausa;
	
	public PacienteMasculino(String cpf, float peso, float altura, char sexo, int idade, Date andropausa) {
		super(cpf, peso, altura, sexo, idade);
		this.andropausa = andropausa;
	}
	
	
	
	public String toString() {
		return "Paciente Masculino[cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", idade=" + idade
				+ ", Andropausa: "+andropausa+"]";
	}

}
