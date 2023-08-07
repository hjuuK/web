<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<jsp:useBean id="names" class="java.util.ArrayList" />
<%
    names.add("이름1");
    names.add("이름2");
    names.add("이름3");
    names.add("이름4");
%>
<%=names%>