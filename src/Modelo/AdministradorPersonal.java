package Modelo;

public class AdministradorPersonal {
	
	public MedicoActivo darDeAltaMedicoActivo(String idMedico, String nombre, String telefono, String direccion, Especialidades especialidad, Consulta consulta, Horario horario) {
		MedicoActivo medico = new MedicoActivo(idMedico, nombre, direccion, telefono, especialidad, consulta, horario);
		
		
		return medico;
	}
	
	public CirujanoActivo darDeAltaCirujanoActivo(String idMedico, String nombre, String telefono, String direccion, Especialidades especialidad, Consulta consulta) {
		CirujanoActivo cirujano=new CirujanoActivo(idMedico, nombre, direccion, telefono, especialidad);
		
		return cirujano;
	}
	
	public Medico getDatosMedicoGenerales(String idMedico, String nombre, String telefono, String direccion, Especialidades especialidad) {
		Medico medico = new Medico(idMedico, nombre, direccion, telefono, especialidad);
		
		return medico;
	}
}
