package Modelo;

import java.util.Date;

public class Tratamiento {
	private String idPaciente;
	private Medicamentos medicacion;
	private String dosis;
	private String periodo;
	
	public Tratamiento(String idPaciente, Medicamentos medicacion, String dosis, String periodo) {
		super();
		this.idPaciente=idPaciente;
		this.medicacion=medicacion;
		this.dosis=dosis;
		this.periodo=periodo;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public Medicamentos getMedicacion() {
		return medicacion;
	}

	public String getDosis() {
		return dosis;
	}

	public String getPeriodo() {
		return periodo;
	}

	
	
}
