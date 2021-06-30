package cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

//Get a cookie value from a request
@WebServlet(name = "CookieServletRequest", value = "/cookieRequest")
public class CookieServletRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        String cookieName = "userIdCookie";
        String cookieValue = "";
        for (Cookie cookie : cookies) {
            if (cookieName.equals((cookie.getName())))
                cookieValue = cookie.getValue();
        }
        out.println("<h1> CookieServletRequest cookieValue: " + cookieValue + "</h1>");

        cookieValue = Arrays.stream(cookies)
                .filter(x -> cookieName.equals(x.getName()))
                .findAny()
                .get()
                .getValue();
        out.println("<h1> CookieServletRequest cookieValue: " + cookieValue + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
