package academia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;

public class Main {
	static String hostname = "localhost";
	static String dbname = "academia"; 
	static String base ="Academia";


	public static void main(String[] args) {
		agregar(hostname,dbname);
		borrar(hostname,dbname);
		modificar(hostname, dbname, "Profe1", "Apellido2");
		consulta(hostname,dbname);

	}



	public static void agregar(String hostname, String dbname) {
		System.out.println("Agregando");
		try {
			//Abrir base de datos
			MtDatabase db = new MtDatabase(hostname,dbname, new MtPackageObjectFactory("",base));
			db.open();
			db.startTransaction();
			System.out.println("Contectando a la base de datos => "+ db.toString());

			//crear Profesor
			PROFESORES p1 = new PROFESORES(db);
			p1.setNombre("Profe1");
			p1.setApellidos("Apellido1");
			p1.setTelefono(000000);
			p1.setDni("1234123a");

			//crear asignaturas
			ASIGNATURAS as1 = new ASIGNATURAS(db);
			as1.setFecha("Lunes");
			as1.setNombre("Lengua");
			as1.setAula(2);
			as1.setDuracion(60);
			as1.setHoraInicio(8);


			//crear cursos
			CURSOS cur1 = new CURSOS(db);
			cur1.setFecha("11/1/2021");
			cur1.setNombre("Primero");
			cur1.setAula(2);
			cur1.setDuracion(60);
			cur1.setHoraInicio(8);
			//crear clases
			CLASES[] c1 = new CLASES[2];
			c1[0]= as1;
			c1[1]= cur1;

			p1.setImparten(c1);

			db.commit();
			db.close(); 
			System.out.println("Agregación completada");
		} catch (Exception e) {
			System.out.println("MtException : " + e.getMessage()); 
		}

	}

	public static void borrar(String hostname, String dbname) {
		System.out.println("Borrando todo");
		try {

			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", base));
			db.open();
			db.startTransaction(); 
			// Lista todos los objetos Obra que hay en la base de datos, con el método
			// getInstanceNumber
			System.out.println("\n" + CLASES.getInstanceNumber(db) + " Clases en la DB.");
			// Borra todas las instancias de Obra
			CLASES.getClass(db).removeAllInstances();
			//pruebas
			System.out.println("Probando si todo a sido eliminado: ");
			System.out.println(CLASES.getInstanceNumber(db) + " Clases en la DB.");
			// materializa los cambios y cierra la BD
			db.commit();
			db.close(); 

		} catch (Exception e) {
			System.out.println("Error -->"+ e.getMessage());
		}
	}

	public static void modificar(String hostname, String dbname, String	nombreprofe, String nuevoApellido) {
		System.out.println("Modifica un profesor");
		int nprofesores = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", base));
			db.open();
			db.startTransaction();
			// Lista cuántos objetos Obra con el método getInstanceNumber
			System.out.println("\n" + PROFESORES.getInstanceNumber(db) + " profesores en la DB.");
			nprofesores = (int) PROFESORES.getInstanceNumber(db);
			// Crea un Iterador (propio de Java)
			MtObjectIterator<PROFESORES> iter =
					PROFESORES.<PROFESORES>instanceIterator(db);
			while (iter.hasNext()) {
				PROFESORES[] prof = iter.next(nprofesores);
				for (int i = 0; i < prof.length; i++) { 
					// Busca una autor con nombre 'nombre'
					if (prof[i].getNombre().compareTo(nombreprofe)
							== 0) {
						prof[i].setApellidos(nuevoApellido);
					} else {
					}
				}
			}
			iter.close();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
			System.out.println("Modificación terminada");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	public static void consulta(String hostname, String dbname) {
		System.out.println("Iniciando Consulta");
		MtDatabase dbcon = new MtDatabase(hostname, dbname);	
		dbcon.open();
		try {
			Statement stmt = dbcon.createStatement();
			String comando = "SELECT * FROM academia.PROFESORES;";
			ResultSet rset = stmt.executeQuery(comando);
			PROFESORES p1;

			while (rset.next()) {
				p1 = (PROFESORES) rset.getObject(1);
				System.out.println("Profesor: "+ String.format("%16s", p1.getNombre())
				+String.format("%16s", p1.getApellidos())
				+String.format("%16s", p1.getTelefono())
				+String.format("%16s", p1.getDni()));
			}	
			// Cierra las conexiones
			rset.close();
			stmt.close();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error de consulta");
		}



	}
}

