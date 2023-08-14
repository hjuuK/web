package filters;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.UnsupportedEncodingException;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(HttpServletRequest request) {
        super(request);

        // 요청전 공통 처리 부분
        String method = request.getMethod().toUpperCase();
        if (method.equals("POST")) {
            try {
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {}
        }

        System.out.println("요청전 공통 처리 부분");
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);

        return value.toUpperCase();
    }
}
