package filters;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {
    public CommonResponseWrapper(HttpServletResponse response) {
        super(response);

        System.out.println("응답 후 공통 기능!");
    }
}
