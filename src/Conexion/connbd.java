package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connbd {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_db","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }

    public ResultSet ejecutarSQLSelect(String sql)
    {
       ResultSet resultado;
       try {
          PreparedStatement sentencia = conectar.prepareStatement(sql);
          resultado = sentencia.executeQuery();
          return resultado;
       } catch (SQLException ex) {
          System.err.println("Error "+ex);
          return null;
       }
    }
}