
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.usuariosModel;


public class loginDAO {
   int respuesta=0;
   String sql="";
   ResultSet rs=null;
    conexion cn=new conexion();
   public int validarlogin(usuariosModel us) throws SQLException{
       sql-"COUNT (usuarios) AS cantidad FROM usuarios WHERE usuario_generado='"+us.getUsuario_generado()+"'AND contrasena='"+us.getContrasena()+;"'";
              rs=cn.ejecutarConsulta(sql);
              while(rs.next()){
                  respuesta=rs.getInt("cantidad");
                
                          
              }
       return respuesta;
  
    }

   
    
              
    
    
}
