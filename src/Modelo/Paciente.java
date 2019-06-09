package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Stack;

public class Paciente extends Persona implements Serializable{
	private Date fechaNacimiento; //hay que cambiar el tipo de dato
	private Stack<Cita> citasPendientes;
	
	public Paciente(String idPersona, String nombre, String direccion, String telefono, Date fechaNacimiento) {
		super(idPersona, nombre, direccion, telefono);
		this.setFechaNacimiento(fechaNacimiento);
		citasPendientes=new Stack<Cita>();
	}

	public Stack<Cita> getCitas() {
		return citasPendientes;
	}

	public void setCitas(Stack<Cita> citas) {
		this.citasPendientes = citas;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
