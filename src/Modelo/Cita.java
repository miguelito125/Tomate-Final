package Modelo;


import java.time.LocalTime;


public class Cita {
	private String idCita;
	private String idPaciente;
	private String idMedico;
	private LocalTime hora;
	private DiasDeLaSemana dia;
	private boolean confirmacionDeAsistencia;
	private String observaciones;
	
	public Cita(String idCita, String idPaciente, String idMedico, boolean confirmacionAsistencia, LocalTime fechaCita, DiasDeLaSemana dia) {
		super();
		this.idCita=idCita;
		this.idPaciente=idPaciente;
		this.idMedico=idMedico;
		confirmacionAsistencia=true;
		fechaCita= LocalTime.of(fechaCita.getHour(), 0);
		this.dia=dia;
	}

	public String getIdMedico() {
		return idMedico;
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

	public String getPaciente() {
		return idPaciente;
	}

	public void setPaciente(String paciente) {
		this.idPaciente = paciente;
	}

	public DiasDeLaSemana getDia() {
		return dia;
	}
	
}
