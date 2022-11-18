package edu.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class PedidoServicioImpl implements PedidoServicio {

	private DataSource ds;
	
	public void insertAlumno(int id, String cod_estado_envio) {

		System.out.println("[INFO] -- Entrando en consultas.AlumnoImpl.insertAlumno");
		try {
			Connection conn = ds.getConnection();
			// Realizamos el insert
			Statement st = conn.createStatement();

			String sql = "INSERT INTO \"public\".\"alumno\" VALUES(DEFAULT, \' " + cod_estado_envio +"\');";
			System.out.println(sql);
			st.executeUpdate(sql);
			// Cerramos la conexión
		} catch (Exception e) {
			System.out.println("[ERROR] -- consultas.AlumnoImpl.insertAlumno -- " + e.toString());
			e.printStackTrace();
		}
		System.out.println("[INFO] -- consultas.AlumnoImpl.insertAlumno");

	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	
	
	
	
}


