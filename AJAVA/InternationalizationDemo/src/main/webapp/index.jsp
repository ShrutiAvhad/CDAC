<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Internationalization</title>
</head>

<body>

<c:set var="theLocale" value="${param.theLocale != null ? param.theLocale : pageContext.request.locale}" />

<fmt:setLocale value="${theLocale}" scope="session" />
<fmt:setBundle basename="com.app.mylabels" />

<a href="index.jsp?theLocale=en_US">English(US)</a> 
<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a> 
<a href="index.jsp?theLocale=de_DE">German(DE)</a> 
<a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a>

<hr>

<fmt:message key="label.greeting"/><br><br>

<fmt:message key="label.firstname"/> <i>Shruti</i><br><br>

<fmt:message key="label.lastname"/> <i>Avhad</i><br><br>

<fmt:message key="label.welcome"/><br><br>

<hr>
Selected Locale: ${theLocale}
</body>
</html>