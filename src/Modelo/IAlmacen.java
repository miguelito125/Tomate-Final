package Modelo;

public interface IAlmacen <T, S>{
	public T obtener(S id);
	public boolean grabar(T t) ;
	public boolean borrar(S id);
}
