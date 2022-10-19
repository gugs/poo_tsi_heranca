package org.heranca.tsi.app.model;

import java.util.Date;

public class PacienteFeminino extends Paciente{

	Date menopausa;
	
	public PacienteFeminino(String cpf, float peso, float altura, char sexo, int idade, Date menopausa) {
		super(cpf, peso, altura, sexo, idade);
		this.menopausa = menopausa;
	}
	
	public String toString() {
		return "Paciente Feminino[cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", idade=" + idade
				+ ", Menopausa: "+menopausa+"]";
	}
	
	public float calcularMetabolismoBasal() {
		if(idade>=0 && idade < 3)
			return (61.0f*peso)-51;
		else if(idade>=3 && idade < 10)
			return (22.5f*peso)+499;
		else
			return  (12.2f*peso)+746;
	}

}
