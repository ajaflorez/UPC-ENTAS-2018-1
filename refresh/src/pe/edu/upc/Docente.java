package pe.edu.upc;

public class Docente extends Persona{

	private String escuela;
	private String curso;
	
	public Docente(int id, int dni, String apellidos, 
			String nombres, String escuela, String curso) {
		super(id, dni, apellidos, nombres);
		// TODO Auto-generated constructor stub
		this.escuela = escuela;
		this.curso = curso;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
