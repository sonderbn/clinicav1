package capa.persistencia;

import java.sql.DriverManager;

public class AccesoDatosJDBCPostgreSQL extends AccesoDatosJDBC {

    @Override
    public void abrirConexion() {
        try {
            String url = "jdbc:postgresql://localhost:5432/basedatosclinica";
            conexion = DriverManager.getConnection(url, "postgres", "123");
        } catch (Exception e) {
            throw new IllegalArgumentException("Ocurrio un problema en la conexión con la base de datos.", e);
        }

    }

}
