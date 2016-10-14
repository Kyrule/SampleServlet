package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class Servlet
 * 
 */
@WebServlet(description = "This is a simple servlet", urlPatterns = { "/Servlet2" })
public class Servlet extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String searchTerm = request.getParameter("searchTerm");
		PrintWriter writer = response.getWriter();
		writer = response.getWriter().append("<html><body>").append(request.getContextPath());
		writer.println("&nbsp;Served at: <br />");
		writer.println("<p>You searched for.. "+searchTerm+"</p></body></html>");
	} 
}
