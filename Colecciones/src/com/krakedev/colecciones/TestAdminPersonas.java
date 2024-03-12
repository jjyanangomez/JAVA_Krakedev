package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {
	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Juan", "Yanangomez",26));
		admin.agregar(new Persona("Albert", "Wesker",54));
		admin.agregar(new Persona("Jill", "Valentine",35));
		admin.imprimir();
		Persona p1 = admin.buscarPorNombre("Juan");
		if(p1!=null) {
			System.out.println("Encontrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con ese nombre");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(30);
		System.out.println("Mayores: "+personasMayores.size());
	}
	
}
