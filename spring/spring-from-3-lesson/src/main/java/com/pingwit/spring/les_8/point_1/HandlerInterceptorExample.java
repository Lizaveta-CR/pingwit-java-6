package com.pingwit.spring.les_8.point_1;

import java.nio.file.AccessDeniedException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class HandlerInterceptorExample implements HandlerInterceptor {

    private final String AUTH_HEADER = "x-auth";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("houses")) {
            String header = request.getHeader(AUTH_HEADER);
            if (header == null) {
                throw new AccessDeniedException("User is not authorized");
            }
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
