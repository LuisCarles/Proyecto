
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static String url = "jdbc:mysql://localhost/bd_login";
    private static String usuario = "";
    private static String contrasena = "pass";
    
    
    public static Connection conectar(){
        Connection conexion = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_login","root","1234567890");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return conexion;
    }
    
    
//    public static void main (String [] args){
//    
//        try {
//            conexion = conectar();
//            String consulta = "INSERT INTO usuarios (id,nombre,apellidos,contrasena,usuario_generado) VALUES ('abc','william','zamora','123','wilzam@hotmail.com')";
//            sentenciaPreparada = conexion.prepareStatement(consulta);
//            int i = sentenciaPreparada.executeUpdate();
//            
//            if(i > 0){
//                System.out.println("Se guardaron los datos");
//            }else{
//                System.out.println("NO guardaron los datos");
//            }
//            conexion.close();
//        } catch (SQLException e) {
//            System.out.println("Error: " + e);
//        }
//    }
    
}
