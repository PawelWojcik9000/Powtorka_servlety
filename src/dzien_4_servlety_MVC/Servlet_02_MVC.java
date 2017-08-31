package dzien_4_servlety_MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_02_MVC")
public class Servlet_02_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int start = Integer.parseInt(request.getParameter("start"));
		int end = Integer.parseInt(request.getParameter("end"));
		start += 10;
		end += 10;
		request.setAttribute("start", start);
		request.setAttribute("end", end);
		getServletContext().getRequestDispatcher("/dzien_4_mvc_2.jsp").forward(request, response);
	}

}
