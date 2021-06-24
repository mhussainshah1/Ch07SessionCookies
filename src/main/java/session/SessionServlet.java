package session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import shopping.Cart;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "SessionServlet", value = "/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get a Session object
        HttpSession session = request.getSession();

        //get a String object
        String productCode = (String) session.getAttribute("productCode");
        session.setAttribute("productCode",productCode); //set a String object as an attribute

        //get user defined object
        Cart cart = (Cart) session.getAttribute("cart");
        if(cart == null){
            cart = new Cart();
        }

        //remove an object
        session.removeAttribute("productCode");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
