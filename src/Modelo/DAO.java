package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO {


	private FileInputStream abrir(String path) {
		File file = new File(path);
		assert file.exists();
		FileInputStream flujoR = null;
		try {
			flujoR = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		}
		return flujoR;
	}

	public Object leer(String path) {
		Object t = null;
		FileInputStream flujoR = abrir(path);
		if (flujoR != null) {
			try {
				ObjectInputStream adaptador = new ObjectInputStream(flujoR);
				t = (Object) adaptador.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return t;
	}
	
	public boolean borrarFile(String path) {
		boolean retorno=false;
		assert path!=null;
		
		File file=new File(path);
		retorno=file.delete();
		
		return retorno;
	}

	
	private FileOutputStream abrir(String path, boolean adicion) {
		FileOutputStream flujoW = null;
		File file = new File(path);
		try {
			flujoW = new FileOutputStream(file, adicion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flujoW;
	}


	public boolean grabar(String path, Object object) {
		assert path != null && object != null;
		File file = new File(path);
		boolean retorno = true;
		FileOutputStream flujoW = abrir(path, false);
		try {
			ObjectOutputStream adaptador = null;
			adaptador = new ObjectOutputStream(flujoW);
			adaptador.writeObject(object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		}
		return retorno;
	}

}
