package com.krakedev.Excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(3);
		//NPe es un Unchecked
	}
	public void metodo2() {
		File f = new File("archivo.txt");
		try {
			f.createNewFile(); //IOexception checked
		} catch (IOException io) {
			// TODO: handle exception
			System.out.println(io);
		}
		
	}
	public void metodo3() throws IOException {
		File f = new File("archivo.txt");
		f.createNewFile(); //IOexception checked
	}
	
	public void metodo4() {
		//metodo3();
	}
}
