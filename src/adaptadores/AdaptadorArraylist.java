package adaptadores;

import java.util.ArrayList;

public class AdaptadorArraylist <T> {
public String[] convertirString(ArrayList<T> list) {
	String[] miarray = new String[list.size()];
	return list.toArray(miarray);	
}
public ArrayList<T[]> convertir(T[] list) {
	ArrayList<T[]> lista=new ArrayList<>();
	lista.add(list);
	return lista;	
}
}
