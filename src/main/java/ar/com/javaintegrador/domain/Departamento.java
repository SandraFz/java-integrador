package ar.com.javaintegrador.domain;

public class Departamento {

	 private Long numero;
	 private String nombre;
	 private Double presupuesto;
	 
	public Departamento() {
		super();
	}

	public Departamento(Long numero, String nombre, Double presupuesto) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ", presupuesto=" + presupuesto + "]";
	}
	 
	
	 
}
