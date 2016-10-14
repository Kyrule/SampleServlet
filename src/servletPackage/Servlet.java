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
//		System.out.println("Test");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter().append("Served at: ").append(request.getContextPath());
		writer.println("<html><body>This is <b>bold</b></body></html>");
	} 
}
