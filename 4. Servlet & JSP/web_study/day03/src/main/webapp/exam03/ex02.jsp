<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex02.jsp</h1>
<%
    String key1 = request.getParameter("key1"); // 요청 데이터 조회
    String key2 = request.getParameter("key2");
%>
key1 : <%=key1%><br>
key2 : <%=key2%>