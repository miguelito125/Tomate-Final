package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PruebasIndependientes {

	@Test
	void test() {
		ArrayList<String[]> filas=new ArrayList<>();
		String data[][]= new String[2][1];
		String [] titulosColumnas = {"Paciente","Operacion","Cirujano","Resultado"};
		String [] titulosColumnas2 = {"asffas","gasfgasf","wter","hgf"};
		filas.add(titulosColumnas);
		filas.add(titulosColumnas2);
		System.out.println(data[0].length);
		String cadena2[]=new String[1];
		System.out.println(data.length);

//		filas.add(filas2.toArray(cadena2));
//		filas.add(filas2.toArray(cadena2));
		
		String cadena[]=new String[1];
//		for (String [] string : filas) {
//			System.out.println(string);
//			for (int i = 0; i < string.length; i++) {
//				System.out.println(string[i]);
//			}
//		}
		
		
	}

}
