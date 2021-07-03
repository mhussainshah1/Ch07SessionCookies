package practice.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InvalidateServlet", value = "/invalidate")
public class InvalidateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // create session if none exists (default) and obtain reference
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();

        //ID for a session
        String jSessionId = session.getId();
        out.println("EnumerationServlet jSessionId: " + jSessionId);

        //invalidate session
        session.invalidate();

        // print 'null' (create=false makes sure no new session is created)
        session = request.getSession(false);
        out.println("EnumerationServlet session: " + session);

        if (session == null) {
            out.println("session is null");
        }

        //all session methods throw an IllegalStateException
        out.println(session.getMaxInactiveInterval());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
