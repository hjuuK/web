<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.Book" %>
<jsp:useBean id="book" class="models.Book" />
<jsp:setProperty name="book" property="title" value="책1" />
<jsp:setProperty name="book" property="author" value="저자1" />
<jsp:setProperty name="book" property="publisher" value="출판사1" />

제목 : <jsp:getProperty name="book" property="title" /><br>
저자 : <jsp:getProperty name="book" property="author" /><br>
출판사 : <jsp:getProperty name="book" property="publisher" />