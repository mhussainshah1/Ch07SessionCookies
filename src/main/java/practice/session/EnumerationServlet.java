package practice.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "EnumerationServlet", value = "/enumeration")
public class EnumerationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        //get a Session object
        HttpSession session = request.getSession();
        Enumeration<String> names = session.getAttributeNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String value = (String) session.getAttribute(key);
            out.println("EnumerationServlet key : " + key + " value: " + value);
        }

        //ID for a session
        String jSessionId = session.getId();
        out.println("EnumerationServlet jSessionId: " + jSessionId);

        //set the inactive interval for a session
        session.setMaxInactiveInterval(60 * 60 * 24); //one day
        session.setMaxInactiveInterval(-1); // until the browser is closed

        out.println("EnumerationServlet :" + session.getMaxInactiveInterval());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
