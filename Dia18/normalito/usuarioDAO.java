
package normalito;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class usuarioDAO {
    private String URL = "jdbc:mysql://b8hkyhwduvotptz2h72h-mysql.services.clever-cloud.com:3306/b8hkyhwduvotptz2h72h";
    private String USUARIO = "utyzmmzvms4losbm";
    private String PASSWORD = "h5QWTUt95tACXFyo26XH";
    
    //Metodo para conectar a la BDD
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    
    public void insertUsuario(String nombre, String email){
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try {
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            //asignado valores a las incognitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            
            //ejecucion de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //leer(SELECT)
    //select * from usuarios;
    public List<String> obtenerUsuarios(){
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
    
    public void actualizarUsuario(int id, String nombre, String email){
        String sql= "update usuarios set nombre=?, email=? where id=?";
        try {
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            //asignado valores a las incognitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            
            int filas = solicitud.executeUpdate();
            if(filas>0){
                System.out.println("Usuario actualizado de manera exitosa!");
            }
            else{
                System.out.println("no se pudo actualizar el usuario con la id !" + id);
            }  
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void eliminarUsuario(int id){
        try {
            String sql= "Delete from usuarios where id = ?";
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            
            solicitud.setInt(1,id);
            int filas = solicitud.executeUpdate();
            if(filas>0){
                System.out.println("Usuario eliminado de manera exitosa!");
            }
            else{
                System.out.println("no se pudo actualizar el usuario con la id !" + id);
            }  
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
    public List<String> listarPorId(int id){
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
