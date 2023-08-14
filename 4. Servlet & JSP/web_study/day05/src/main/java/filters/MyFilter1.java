package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("요청전 - Filter1");

        chain.doFilter(request, response); // 다음 필터가 있으면 다음 필터를 호출, 없으면 서블릿의 요청 메서드 호출 // MyFilter2

        System.out.println("요청후 - Filter1");
    }
}
