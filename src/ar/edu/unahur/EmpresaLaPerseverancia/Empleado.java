package ar.edu.unahur.EmpresaLaPerseverancia;

abstract class Empleado {
	protected String nombre;
	protected Integer id;
	protected Integer cantdHijos;
	protected Boolean estadoCivil = Boolean.FALSE;
	protected Integer valorHoraTrabajada;
	protected Integer aniosAntiguedad = 0;
	protected Integer salarioFamiliar;
	
	public Empleado(Integer id, String nombre, Integer cantdHijos) {
		this.id = id;
		this.nombre = nombre;
		this.cantdHijos = cantdHijos;
		this.salarioFamiliar = (2000*this.cantdHijos);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public Integer getCantdHijos() {
		return this.cantdHijos;
	}
	
	public String getEstadoCivil() {
		String estadoCivil = "Soltero";
		if (this.estadoCivil) { estadoCivil = "Casado" ;}
		return estadoCivil;
	}
	
	public void setAniosAntiguedad(Integer antiguedad) {
		this.aniosAntiguedad += antiguedad;
	}
	
	public void esCasado() {
		this.estadoCivil = Boolean.TRUE;
		this.salarioFamiliar += 1000;
	}
	
	public abstract Integer cobrarSueldo(Integer horasTrabajadas);

}
