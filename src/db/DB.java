package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	//MÉTODO PARA CONECTAR COM O BANCO DE DADOS
	private static Connection conn = null;
	public static Connection getConnection() {
		
		if(conn == null) {
			try {
				Properties props = carregaProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url,props);
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	return conn;
}

	//MÉTODO PARA FECHAR BANCO DE DADOS
	public static void fecharConnection() {
		if (conn != null) {
			try {
				conn.close();
			}
			catch (SQLException e) {
			 throw new DbException(e.getMessage());
		}
	}
}
	//MÉTODO AUXILIAR PARA CARREGAR OS DADOS DO ARQUIVO "db.properties"
	private static Properties carregaProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
}
