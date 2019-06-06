package Modelo;


import java.io.Serializable;
import java.time.LocalTime;


public class Cita implements Serializable {
	private String idCita;
	private Paciente paciente;
	private Medico medico;
	private LocalTime hora;
	private DiasDeLaSemana dia;
	private boolean confirmacionDeAsistencia;
	private String observaciones;	 
	
	public Cita(String idCita, Paciente paciente, Medico medico, boolean confirmacionAsistencia, LocalTime fechaCita, DiasDeLaSemana dia) {
		super();
		this.idCita=idCita;
		this.medico=medico;
		this.paciente=paciente;
		confirmacionAsistencia=true;
		fechaCita= LocalTime.of(fechaCita.getHour(), 0);
		this.dia=dia;
	}

	

	public String getIdCita() {
		return idCita;
	}

	public LocalTime getFechaCita() {
		return hora;
	}

	public boolean isConfirmacionDeAsistencia() {
		return confirmacionDeAsistencia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	
	public Paciente getPaciente() {
		return paciente;
	}



	public Medico getMedico() {
		return medico;
	}



	public DiasDeLaSemana getDia() {
		return dia;
	}
	
}
