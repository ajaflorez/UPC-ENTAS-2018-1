package pe.edu.upc;

public abstract class Persona {
	private int id;
	private int dni;
	private String apellidos;
	private String nombres;
		
	public Persona(int id, int dni, String apellidos, String nombres) {
		this.id = id;
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombres = nombres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
}
