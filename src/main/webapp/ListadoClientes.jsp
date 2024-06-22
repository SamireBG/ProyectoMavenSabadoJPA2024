<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE htm">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Clientes</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Clientes Registrados en BD</h1>

<table border="2" align="center">

	<tr>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>DNI</td>
		<td>Email</td>
		<td>Telefono</td>
		<td>Sexo</td>
		<td>Nacionalidad</td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="Registrar Cliente">
		</td>
	</tr>
	
</table>
</body>
</html>