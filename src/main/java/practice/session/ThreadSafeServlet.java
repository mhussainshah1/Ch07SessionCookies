package practice.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import practice.shopping.Cart;

import java.io.IOException;

@WebServlet(name = "ThreadSafeServlet", value = "/threadSafe")
public class ThreadSafeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart;
        final Object lock = session.getId().intern();
        synchronized (lock) {
            cart = (Cart) session.getAttribute("cart");
            session.setAttribute("cart", cart);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
