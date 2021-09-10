package com.training.spring.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/first/*")
public class MyWebFilter implements Filter {

    @Override
    public void doFilter(final ServletRequest requestParam,
                         final ServletResponse responseParam,
                         final FilterChain chainParam) throws IOException, ServletException {

        System.out.println("Fiter run");
        chainParam.doFilter(requestParam,
                            responseParam);

    }

}
