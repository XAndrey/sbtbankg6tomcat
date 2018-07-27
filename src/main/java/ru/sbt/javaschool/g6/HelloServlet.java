package ru.sbt.javaschool.g6;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AndreyX on 22.07.18.
 */
public class HelloServlet extends HttpServlet {
        public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
                throws IOException {
            httpServletResponse.setContentType("text/html; charset=UTF-8");
            httpServletResponse.getWriter().print("Hello from servlet. Тут немного текста кириллицей для проверки.");

    }

}
