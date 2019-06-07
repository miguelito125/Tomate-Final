package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Horario {
	private int horarioSemanal[][] = new int[5][4];
	private String horaTrabajo[];
	private DiasDeLaSemana diaTrabajo[];

	public Horario(String[] horaTrabajo, DiasDeLaSemana[] diaTrabajo) {
		super();
		this.horaTrabajo = horaTrabajo;
		this.diaTrabajo = diaTrabajo;
		for (int i = 0; i < diaTrabajo.length; i++) {
			for (int j = 0; j < horaTrabajo.length; j++) {
				horarioSemanal[diaTrabajo[i].getValor()-1][Integer.valueOf(horaTrabajo[j])] = 1;
			}
		}
	}

	public int[][] getHorarioSemanal() {
		return horarioSemanal;
	}

	public String[] getHoraTrabajo() {
		return horaTrabajo;
	}

	public DiasDeLaSemana[] getDiaTrabajo() {
		return diaTrabajo;
	}

	public void reservarDia (int x,int y) {
		horarioSemanal[x][y]=2;
	}
}
