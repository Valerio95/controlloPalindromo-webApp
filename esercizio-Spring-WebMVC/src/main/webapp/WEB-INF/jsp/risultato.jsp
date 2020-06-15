<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



		<br> <br>Ecco il risultato <br> <br>
		
		il numero di parole è: <b>${risposta.getNumeroParole()}</b>
		
		il numero di palindromi è: <b>${risposta.getNumeroPalindromi()}</b>
		
	 la lista dei palindromi è: 
		<c:forEach items="${risposta.getListaPalindromi()}" var="palindromo">
			<li><c:out value="${palindromo }" /></li>

			
		</c:forEach>
		
</body>
</html>