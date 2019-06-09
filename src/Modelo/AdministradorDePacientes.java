package Modelo;

import java.util.Date;

public class AdministradorDePacientes {
	
	public Paciente darDeAltaPaciente(String idPersona, String nombre, String direccion, String telefono, Date fechaNacimiento) {
		Paciente paciente=new Paciente(idPersona, nombre, direccion, telefono, fechaNacimiento);
		
		return paciente;
	}
	
}
