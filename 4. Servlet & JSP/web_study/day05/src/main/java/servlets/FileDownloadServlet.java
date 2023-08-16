package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet("/file/download")
public class FileDownloadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out = resp.getOutputStream();
        File file = new File("C:/uploads/abc.txt");
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            String fileName = "한글 파일명.txt"; // 윈도우즈(2바이트) 파읾명을 못읽기 때문에 밑에 방법으로 변환 필요
            fileName = new String(fileName.getBytes("UTF-8"), "ISO8859_1"); // 웹(3바이트) -> 윈도우즈(2바이트)
            resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            resp.setHeader("Content-Type", "application/octet-stream");
            resp.setIntHeader("Expires", 0); // 파일 용량이 큰 경우 만료 X
            resp.setHeader("Cache-Control", "must-revalidate");
            resp.setHeader("Pragma", "public");
            resp.setHeader("Content-Length", String.valueOf(file.length()));    // 파일 용량

            while(bis.available() > 0) {
                out.write(bis.read());
            }
            out.flush();
        } 
        
        
//        PrintWriter out = resp.getWriter();
//        out.println("테스트1");
//        out.println("테스트2");
//        out.println("테스트3");
    }
}
