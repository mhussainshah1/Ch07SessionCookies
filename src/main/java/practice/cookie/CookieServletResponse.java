package practice.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//Create a cookie and sets it in a response
@WebServlet(name = "CookieServlet", value = "/cookieResponse")
public class CookieServletResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = "amir";
        Cookie c = new Cookie("userIdCookie", userId);
        c.setMaxAge(60 * 60 * 24 * 365 * 2); //2 years
        c.setPath("/");//allow access by entire app
        response.addCookie(c);
        this.getServletContext().getRequestDispatcher("/cookieRequest").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
