package session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import shopping.Cart;

import java.io.IOException;

@WebServlet(name = "ThreadSafeServlet", value = "/threadSafe")
public class ThreadSafeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart;
        final Object lock = session.getId().intern();
        synchronized (lock){
            cart = (Cart) session.getAttribute("cart");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
