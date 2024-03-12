package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMaquina(String codigoC1, String codigoC2, String codigoC3, String codigoC4) {
		this.celda1= new Celda(codigoC1);
		this.celda2= new Celda(codigoC2);
		this.celda3= new Celda(codigoC3);
		this.celda4= new Celda(codigoC4);
		
	}
	public void mostrarConfiguracion() {
		System.out.println("Codigos:"
				+"\nCelda 1: "+celda1.getCodigo()
				+"\nCelda 2: "+celda2.getCodigo()
				+"\nCelda 3: "+celda3.getCodigo()
				+"\nCelda 4: "+celda4.getCodigo());
	}
	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}
	public void cargarProducto(Producto p, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p, cantidad);
	}
	
	public void mostrarProductos() {
		if(celda1.getProducto()==null) {
			System.out.println("************"+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("************"+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("Nombre producto: " + celda1.getProducto().getNombre() + "\n"
					+ "Precio producto: " + celda1.getProducto().getPrecio() + "\n"
					+"Codigo producto: "+ celda1.getProducto().getCodigo());
		}
		
		if(celda2.getProducto()==null) {
			System.out.println("************"+celda2.getCodigo());
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("La celda no tiene producto!!!");
		
		}else {
			System.out.println("************"+celda2.getCodigo());
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("Nombre producto: " + celda2.getProducto().getNombre() + "\n"
					+ "Precio producto: " + celda2.getProducto().getPrecio() + "\n"
					+"Codigo producto: "+ celda2.getProducto().getCodigo());
		}
		if(celda3.getProducto()==null) {
			System.out.println("************"+celda3.getCodigo());
			System.out.println("Stock: "+celda3.getStock());
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("************"+celda3.getCodigo());
			System.out.println("Stock: "+celda3.getStock());
			System.out.println("Nombre producto: " + celda3.getProducto().getNombre() + "\n"
					+"Precio producto: " + celda3.getProducto().getPrecio() + "\n"
					+"Codigo producto: "+ celda3.getProducto().getCodigo());
		}
		if(celda4.getProducto()==null) {
			System.out.println("************"+celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("************"+celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("Nombre producto: " + celda4.getProducto().getNombre() + "\n"
					+"Precio producto: " + celda4.getProducto().getPrecio() + "\n"
					+"Codigo producto: "+celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo:"+saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1.getProducto();
		}else if(celda2.getCodigo()==codigo) {
			return celda2.getProducto();
		}else if(celda3.getCodigo()==codigo) {
			return celda3.getProducto();
		}else if(celda4.getCodigo()==codigo) {
			return celda4.getProducto();
		}else {
			return null;
		}
	}
	public double consultarPrecio(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo()==codigo) {
			return celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo()==codigo) {
			return celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo()==codigo) {
			return celda4.getProducto().getPrecio();
		}else {
			return 0.0;
		}
	}
	public Celda buscarCeldaProducto(String codigoP){
		if(celda1.getProducto()!=null && celda1.getProducto().getCodigo()==codigoP) {
			return celda1;
		}else if(celda2.getProducto()!=null && celda2.getProducto().getCodigo()==codigoP) {
			return celda2;
		}else if( celda3.getProducto()!=null && celda3.getProducto().getCodigo()==codigoP) {
			return celda3;
		}else if(celda4.getProducto()!=null && celda4.getProducto().getCodigo()==codigoP) {
			return celda4;
		}else {
			return null;
		}
	}
	public void incrementarProductos(String codigoP,int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoP);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
	}
	public void vender(String codigoCelda) {
			
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = getSaldo()+valorProducto;
		mostrarProductos();
	}
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = getSaldo()+valorProducto;
		return valorIngresado-valorProducto;
	}
}
