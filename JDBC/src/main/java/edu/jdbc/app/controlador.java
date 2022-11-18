package edu.jdbc.app;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jdbc.dao.PedidoServicioImpl;

public class controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		PedidoServicioImpl insert =(PedidoServicioImpl) context.getBean("pedidoDao");
		insert.insertAlumno(2, "Alberto");
		
		
	}

} 
