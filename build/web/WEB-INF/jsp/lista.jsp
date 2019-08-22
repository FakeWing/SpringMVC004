<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" /> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/octicons/3.5.0/octicons.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        
        <div class="container">
            <div class="card">
                <div class="card-header bg-info text-white">
                    <h1>Usuarios</h1>
                    
                </div>
                
                <div class="card-body">
                    <p>
                        <a href="crear.htm" class="btn btn-dark">Nuevo Usuario</a>
                    </p>
                    
                    <table class="table table-bordered text-center ">
                        <thead>
                            <tr class="bg-success text-white">
                                <th>Idusuario</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Login</th>
                                <th>Clave</th>
                                <th>Perfil</th>
                                <th>Acciones</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${datos}" var="item">
                                <tr>
                            <td>${item.idusuario}</td>
                            <td>${item.nombre}</td>
                            <td>${item.apellido}</td>
                            <td>${item.login}</td>
                            <td>${item.clave}</td>
                            <td>${item.perfil}</td>
                            <td>
                                <div class="btn-group-toggle">
                                <!--acciones-->
                                <a class="btn btn-info" href="editar.htm?idusuario=${item.idusuario}"><span class="octicon octicon-pencil"></span></a>
                                <a class="btn btn-danger" href="borrar.htm?idusuario=${item.idusuario}"><span class="octicon octicon-trashcan"></span></a>
                               
                              
                                
                                </div>
                            </td>
                                </tr>
                            </c:forEach>
                           
                        </tbody>
                    </table>
                </div> 
                
            </div>
        </div>
    </body>
</html>
