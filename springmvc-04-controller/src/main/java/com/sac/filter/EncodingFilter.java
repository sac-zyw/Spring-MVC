package com.sac.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ShiAC
 * @date 2020/3/30
 */
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
