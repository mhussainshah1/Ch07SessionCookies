package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import shopping.Cart;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/session")
public class AttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get a Session object
        HttpSession session = request.getSession();

        String productCode = request.getParameter("productCode");
        session.setAttribute("productCode", productCode); //set a String object as an attribute

        //get a String object
        productCode = (String) session.getAttribute("productCode");

        PrintWriter out = response.getWriter();
        out.println("AttributeServlet productCode: " + productCode);

        //get user defined object
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
        }

        //remove an object
//        session.removeAttribute("productCode");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
