package paquete;

import pe.edu.upc.Docente;
import pe.edu.upc.Estudiante;
import pe.edu.upc.Persona;
import servicio.DocenteServicio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante carlos;
		carlos = new Estudiante(1, 78451236, "Ruiz", 
				"Carlos", "IS");

		System.out.println(carlos.getApellidos());
		
		Docente manuel = new Docente(2, 478545, "Diaz", 
				"manuel", "IS", "programacion");
		
		System.out.println(manuel.getEscuela());

		DocenteServicio serv = new DocenteServicio();
		serv.save(manuel);
		
	}

}
