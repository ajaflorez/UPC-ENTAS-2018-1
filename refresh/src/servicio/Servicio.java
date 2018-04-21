package servicio;

import pe.edu.upc.Persona;

public interface Servicio {
	public boolean save(Persona persona);
	public boolean update(Persona persona);
	public boolean insert(Persona persona);
	public boolean delete(Persona persona);
	public Persona findById(int id);
}
