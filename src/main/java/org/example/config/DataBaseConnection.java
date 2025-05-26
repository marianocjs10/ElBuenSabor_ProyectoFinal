package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String URL= "jdbc:mysql://localhost:3306/ElBuenSaborDB";
    private static final String USER="root";
    private static final String PASSWORD="";

    static{
        try{
            //carga del driver JDBC de MySql una sola vez
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            //Se lanza una excepción en caso de que el driver no esté disponible
            throw new RuntimeException("Error: No se encontró el driver JDBC.",e);
        }
    }

    public static Connection getConnection() throws SQLException {
        //Validación adicional para asegurarme de que las credenciales no están vacías
        if(URL==null || URL.isEmpty() || USER == null || USER.isEmpty() || PASSWORD==null){
            throw new SQLException(("Configuración de la base de datos incompleta o inválida."));
        }
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
