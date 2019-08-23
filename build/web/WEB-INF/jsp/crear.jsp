<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Usuario</title>
    </head>
    <body>
        <div class="container">
            <div class="card">
                <div class="card-header bg-dark text-white">
                      <h1>Crear Usuario</h1>
                </div>
                <div class="card-body">
                     <f:form method="post" commandName="usuario">
                         
                      
                        
                        <<f:errors path="login" cssClass="alert alert-danger" element="div"/>
                         
                         
                        <p>
                         <f:label path="nombre">Nombre:</f:label>
                        <f:input  path="nombre" class="form-control" required="true"/>   
                        </p>
                        <p>
                         <f:label path="apellido">Apellido:</f:label>
                        <f:input path="apellido" class="form-control" required="true"/> 
                        </p>
                        <p>
                         <f:label path="login">Login:</f:label>
                        <f:input path="login" class="form-control"  required="true" />   
                        </p>
                        <p>
                         <f:label path="clave">Clave:</f:label>
                        <f:input path="clave" class="form-control"  required="true" type="password"/>   
                        </p>
                        <p>
                            <f:label path="perfil">Perfil:</f:label>
                            <f:select path="perfil" cssClass="form-control">
                            <f:option selected="true" disabled="true" value="0">Seleccione...</f:option>
                            <f:option value="1">Administrador</f:option>
                            <f:option value="2">Visita</f:option>
                            </f:select>
                        </p>
                        
                        
                         <p>
                        <f:button class="btn btn-warning">Grabar</f:button>
                         </p>
                    </f:form>
                   
                    
                </div>
            </div>
        </div>
      
    </body>
</html>