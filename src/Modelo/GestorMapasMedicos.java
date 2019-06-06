package Modelo;

import java.util.TreeMap;

public class GestorMapasMedicos {
	private TreeMap<String, String> medicos;
	private TreeMap<String, String> medicosActivos;
	private TreeMap<String, String> cirujanosActivos;
	
	public GestorMapasMedicos() {
		super();
		medicos=new TreeMap<String, String>();
		medicosActivos=new TreeMap<String, String>();
		cirujanosActivos=new TreeMap<String, String>();
	}
	
	public TreeMap<String, String> getMedicos() {
		return medicos;
	}
	
	public TreeMap<String, String> getMedicosActivos() {
		return medicosActivos;
	}
	
	public TreeMap<String, String> getCirujanosActivos(){
		return cirujanosActivos;
	}
	
	public void anadirMedicoAlMapa(Medico medico) {
		medicos.put(medico.getIdPersona(), medico.getNombre());
	}
	
	public void anadirMedicoActivoAlMapa(MedicoActivo medicoActivo) {
		medicosActivos.put(medicoActivo.getIdPersona(), medicoActivo.getNombre());
	}
	
	public void eliminarMedicoActivoDelMapa(MedicoActivo medicoActivo) {
		medicosActivos.remove(medicoActivo.getIdPersona());
	}
	
	public void anadirCirujanoActivoAlMapa(CirujanoActivo cirujanoActivo) {
		cirujanosActivos.put(cirujanoActivo.getIdPersona(), cirujanoActivo.getNombre());
	}
	
	public void eliminarCirujanoActivoDelMapa(CirujanoActivo cirujanoActivo) {
		cirujanosActivos.remove(cirujanoActivo.getIdPersona());
	}
}
