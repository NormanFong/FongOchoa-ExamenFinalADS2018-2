package dominio;

public class Alumno {
	public int FirstName; 
	public int LastName; 
	public int montoBeca;
	public int tipoAlumno; 
	public int notas; 
	
	
	
	public void Alunno() 
	{
		
	}


	public int getFirstName() {
		return FirstName;
	}


	public void setFirstName(int firstName) {
		FirstName = firstName;
	}


	public int getLastName() {
		return LastName;
	}


	public void setLastName(int lastName) {
		LastName = lastName;
	}


	public int getTipoAlumno() {
		return tipoAlumno;
	}

	

	public void setTipoAlumno(int tipoAlumno) {
		this.tipoAlumno = tipoAlumno;
	}


	public int getNotas() {
		return notas;
	}


	public void setNotas(int notas) {
		this.notas = notas;
	}

	public int getMontoBeca() {
		if (tipoAlumno == AlumnoPregrado) montoBeca = 400;
		if (tipoAlumno == AlumnoMaestria) montoBeca = 550;
		if (tipoAlumno == AlumnoDoctorado) montoBeca = 700;
		
		return getMontoBeca();
		
	}
}
