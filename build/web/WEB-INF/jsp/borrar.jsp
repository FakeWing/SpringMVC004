<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" /> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Usuario</title>
    </head>
    <body>
        <div class="container ">
            <div class="card">
                <div class="card-header bg-dark text-white">
                      <h1>ELIMINAR USUARIO</h1>
                </div>
                <div class="card-body">
                     <p>
                             <a class="btn btn-success" href="lista.htm">VOLVER A LA LISTA</a>
                         </p>
                     <f:form method="post" commandName="usuario">
                        
                        
                         <p>
                        <f:button class="btn btn-danger">CONFIRMAR BORRADO</f:button>
                         </p>
                    </f:form>
                   
                    
                </div>
            </div>
        </div>
    </body>
</html>
