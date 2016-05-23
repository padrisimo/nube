<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to nubeagenda</title>
</head>
<body>
	<h1>Bienvenido a tu nubeagenda</h1>
	<%=request.getAttribute("miscontactos")%>
	
	<h1>Resultado Select</h1>
	
	<ul>
		<c:forEach items="${miscontactos}" var="mycontacto">
			<li>${mycontacto.nombre} - ${mycontacto.telefono}</li>
		</c:forEach>
	</ul>
</body>
</html>