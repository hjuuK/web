<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.Book" %>
<h1>게시판 목록!</h1>
<%--
<%
    Book book = (Book)request.getAttribute("book");
    out.write(book.getTitle() + "<br>");
    out.write(book.getAuthor() + "<br>");
    out.write(book.getPublisher() + "<br>");
%>
--%>
${book.getTitle()}<br>
${book.getAuthor()}<br>
${book.getPublisher()}<br>
---------------------------<br>
${book.title}<br>
${book.author}<br>
${book.publisher}<br>
