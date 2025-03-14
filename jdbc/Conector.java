package conector;

import java.sql.*;

public class Conector {
    public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/lll?useSSL=false&serverTimezone=UTC";
    String USER = "root";
    String PASSWORD = "campus2023";
    
    try{
        Connection conexion = DriverManager.getConnection(url, USER, PASSWORD);
        Statement stmt = conexion.createStatement();
        System.out.println("se conecto la base de datos");
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    
}
