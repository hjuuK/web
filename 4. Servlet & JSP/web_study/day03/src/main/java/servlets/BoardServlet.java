package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Book;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>상단!!</h1>");

        Book book = new Book();
        book.setTitle("책1");
        book.setAuthor("저자1");
        book.setPublisher("출판사1");

        req.setAttribute("book", book);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp"); // 외부 노출 X
        rd.forward(req, resp);      // <jsp:forward />와 동일하게 위 아래 출력 X (버퍼 교체)
        //rd.include(req, resp);      // <jsp:include />와 동일 (버퍼 추가)

        out.print("<h1>하단!!</h1>");
    }
}
