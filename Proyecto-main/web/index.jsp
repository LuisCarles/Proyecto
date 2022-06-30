%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">    
    </head>
    <% String respuesta="";
        if(request.getParameter("respuesta")!=null){
            int r=Integer.parseInt(request.getParameter("respuesta"));
            if(r==0){
                respuesta="Contraseña o usuario incorrectos.";
            }
        %>
    <body>
        <div class="container col-lg-3">
            <form method="post" action="index/loginControl">
                <div class="form-group text-center">
                    <img src="img/log.png" height="80"width="80"/>
                    <p><strong>Inicio Sesión</strong></p>
                </div>
                <div class="form-group">
                    <label>Datos:</label>
                    <input class="form-control" type="text" name="txtnom" placeholder="usuario">
                </div>
                <div class="form-group">
                    <input class="form-control" type="password" name="txtpass" placeholder="********">
                </div>
                <input class="btn btn-danger btn-block" type="submit" name="btn-login" value="ingresar">  
                <p style=" color:red;"><%=respuesta%></p>
            </form>            
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
