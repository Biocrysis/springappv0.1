<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="title"></fmt:message></title>


<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		<fmt:message key="priceincrease.heading"></fmt:message>
	</h1>
	<form:form method="post" modelAttribute="priceIncrease">
		<table>
			<tr>
				<td align="right" width="20%">Increase (%):</td>
				<td width="20%"><form:input path="percentage" /></td>
				<td width="60%"><form:errors path="percentage" cssClass="error" />
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Execute">
	</form:form>
<a href='<c:url value="hello.htm"></c:url>'></a>
</body>
</html>