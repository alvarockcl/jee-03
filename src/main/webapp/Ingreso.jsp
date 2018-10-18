<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingreso Producto</title>
</head>
<body>
<h3>Ingreso de producto</h3>
<form action="/jee-03/Productoingreso" method="get">
Nombre :<input type="text" name="nombre"><br>
Stock :<input type="text" name="stock"><br>
<input type="submit" value="Guardar">
<input type="reset" value="Limpiar">
</form>
</body>
</html>