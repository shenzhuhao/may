package com.nsu.MyFilter;


import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter
public class NsuFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        if(request.getRequestURI().equals("/page/hao")){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        if(!StringUtils.isEmpty(request.getHeader("access_token"))){
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            response.sendRedirect("/page/hao");
        }

    }


}
