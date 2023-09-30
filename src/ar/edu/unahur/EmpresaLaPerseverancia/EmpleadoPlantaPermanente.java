package ar.edu.unahur.EmpresaLaPerseverancia;

public class EmpleadoPlantaPermanente extends Empleado {

	public EmpleadoPlantaPermanente(Integer id, String nombre, Integer cantdHijos) {
		super(id, nombre, cantdHijos);
		this.valorHoraTrabajada = 3000;
	}

	@Override
	public Integer cobrarSueldo(Integer horasTrabajadas) {
		Integer sueldoACobrar = 0;
		sueldoACobrar+=((horasTrabajadas*this.valorHoraTrabajada)+(this.aniosAntiguedad*1000))
				+this.salarioFamiliar;
		return sueldoACobrar;
	}
	
}
