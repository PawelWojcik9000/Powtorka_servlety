package dzien_2_servlety_GET;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_06_3")
public class Servlet_GET_06_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int year = Integer.parseInt(request.getParameter("year"));
		int mix = Integer.parseInt(request.getParameter("mix"));
		Integer finalYear = year+mix;
		response.getWriter().append(finalYear.toString());
	}

}
