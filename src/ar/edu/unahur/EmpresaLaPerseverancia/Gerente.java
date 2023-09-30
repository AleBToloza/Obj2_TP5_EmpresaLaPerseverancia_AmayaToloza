package ar.edu.unahur.EmpresaLaPerseverancia;

public class Gerente extends EmpleadoPlantaPermanente {

	public Gerente(Integer id, String nombre, Integer cantdHijos) {
		super(id, nombre, cantdHijos);
		this.valorHoraTrabajada = 4000;
	}

	@Override
	public Integer cobrarSueldo(Integer horasTrabajadas) {
		Integer sueldoACobrar = 0;
		sueldoACobrar+=((horasTrabajadas*this.valorHoraTrabajada)+(this.aniosAntiguedad*1500))
				+this.salarioFamiliar;
		return sueldoACobrar;
	}
	
}
