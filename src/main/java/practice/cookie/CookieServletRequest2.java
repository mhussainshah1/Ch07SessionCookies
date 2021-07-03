package practice.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.util.CookieUtil;

import java.io.IOException;

@WebServlet(name = "CookieServletRequest2", value = "/cookieRequest2")
public class CookieServletRequest2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String cookieValue = CookieUtil.getCookieValue(cookies, "userIdCookie");

        out.println("<h1> CookieServletRequest cookieValue: " + cookieValue + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
