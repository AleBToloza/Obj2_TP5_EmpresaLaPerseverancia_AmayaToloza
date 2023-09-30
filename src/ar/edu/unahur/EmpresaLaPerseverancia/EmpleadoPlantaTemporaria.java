package ar.edu.unahur.EmpresaLaPerseverancia;

public class EmpleadoPlantaTemporaria extends Empleado {

	public EmpleadoPlantaTemporaria(Integer id, String nombre, Integer cantdHijos) {
		super(id, nombre, cantdHijos);
		this.valorHoraTrabajada = 2000;
	}

	@Override
	public Integer cobrarSueldo(Integer horasTrabajadas) {
		Integer sueldoACobrar = 0;
		sueldoACobrar+=(horasTrabajadas*this.valorHoraTrabajada)+this.salarioFamiliar;
		return sueldoACobrar;
	}

}
