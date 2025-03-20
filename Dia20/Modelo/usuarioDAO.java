
package Modelo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class usuarioDAO {
    private static String URL = "jdbc:mysql://b8hkyhwduvotptz2h72h-mysql.services.clever-cloud.com:3306/b8hkyhwduvotptz2h72h";
    private static String USUARIO = "utyzmmzvms4losbm";
    private static String PASSWORD = "h5QWTUt95tACXFyo26XH";
    
    //Metodo para conectar a la BDD
    private static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    
    public void insertUsuario(usuario User){
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try {
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            //asignado valores a las incognitas
            solicitud.setString(1, User.getNombre());
            solicitud.setString(2, User.getEmail());
            
            //ejecucion de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //leer(SELECT)
    //select * from usuarios;
    public static List<String> obtenerUsuarios(){
        String sql = "select * from usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();
            
            while (resultado.next()){
                listaUsuarios.add(resultado.getInt("id") + ","  + resultado.getString("nombre") + "," + resultado.getString("email"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
    public void actualizarUsuario(usuario User){
        String sql= "update usuarios set nombre=?, email=? where id=?";
        try {
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            //asignado valores a las incognitas
            solicitud.setString(1, User.getNombre());
            solicitud.setString(2, User.getEmail());
            solicitud.setInt(3, User.getId());
            
            int filas = solicitud.executeUpdate();
            if(filas>0){
                System.out.println("Usuario actualizado de manera exitosa!");
            }
            else{
                System.out.println("no se pudo actualizar el usuario con la id !" + User.getNombre());
            }  
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void eliminarUsuario(usuario User){
        try {
            String sql= "Delete from usuarios where id = ?";
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            solicitud.setInt(1,User.getId());
            int filas = solicitud.executeUpdate();
            if(filas>0){
                System.out.println("Usuario eliminado de manera exitosa!");
            }
            else{
                System.out.println("no se pudo actualizar el usuario con la id !" + User.getId());
            }  
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
    public static List<String> listarPorId(int id){
        List<String> listaUsuarios = new ArrayList<>();
        try{
            String sql= "select * from usuarios where id =?";
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            solicitud.setInt(1,id);
            
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()){
                listaUsuarios.add(resultado.getInt("id") + ","  + resultado.getString("nombre") + "," + resultado.getString("email"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
}