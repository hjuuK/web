<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex01.jsp - 상단</h1>
<jsp:forward page="ex02.jsp">
    <jsp:param name="key1" value="value1" />
    <jsp:param name="key2" value="value2" />
</jsp:forward>
<h1>ex01.jsp - 하단</h1>