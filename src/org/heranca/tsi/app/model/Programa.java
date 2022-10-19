package org.heranca.tsi.app.model;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		Paciente p1 = new PacienteMasculino("000", 80f, 1.75f, 'M', 15, new Date());
		
		Paciente p2 = new PacienteFeminino("001", 80f, 1.75f, 'F', 15, new Date());
		
		System.out.println(p1.calcularMetabolismoBasal());
		
		System.out.println(p2.calcularMetabolismoBasal());
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
