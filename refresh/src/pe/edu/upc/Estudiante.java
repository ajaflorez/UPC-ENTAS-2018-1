package pe.edu.upc;

public class Estudiante extends Persona{
	// Atributos -> privado
	private String escuela;
	
	public Estudiante(int id, int dni, String apellidos, 
			String nombres, String escuela) {
		// Contructor de la clase base
		super(id, dni, apellidos, nombres);
		this.escuela = escuela;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	
}
