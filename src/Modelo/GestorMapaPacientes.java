package Modelo;
import java.util.TreeMap;

public class GestorMapaPacientes {
	private TreeMap<String, String> mapaPacientes;
	
	public GestorMapaPacientes() {
		super();
		mapaPacientes=new TreeMap<String, String>();
	}

	public TreeMap<String, String> getMapaPacientes() {
		return mapaPacientes;
	}
	
	public void anadirPacienteAlMapa(Paciente paciente) {
		mapaPacientes.put(paciente.getIdPersona(), paciente.getNombre());
	}
	
	public void eliminarPacienteDelMapa(Paciente paciente) {
		mapaPacientes.remove(paciente.getIdPersona());
	}
}
