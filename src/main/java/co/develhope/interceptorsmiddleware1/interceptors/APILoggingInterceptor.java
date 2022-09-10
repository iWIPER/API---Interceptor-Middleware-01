package co.develhope.interceptorsmiddleware1.interceptors;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class APILoggingInterceptor {

    //Method HandleInterceptor
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("User-agent: " + request.getHeader("user-agent"));
        return true;
    }

}