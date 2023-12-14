package capa.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TECNOPATA
 */
public class Conexion {

    public static Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:5432/basedatosclinica";
            return DriverManager.getConnection(url, "postgres", "TecnoP@ta16");
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

}
