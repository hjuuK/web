<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<h1><%=exception.getMessage()%></h2>
<%
    exception.printStackTrace();
%>