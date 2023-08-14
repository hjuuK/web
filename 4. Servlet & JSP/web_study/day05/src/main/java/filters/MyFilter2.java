package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("요청전 - MyFilter2");

        chain.doFilter(request, response);

        System.out.println("요청후 - MyFilter2");
    }
}
