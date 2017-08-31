package dzien_4_servlety_MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_01_MVC")
public class Servlet_01_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double euro = Integer.parseInt(request.getParameter("value"));
		double exchangeRate = 4.3;
		double zlotys = euro*exchangeRate;
		request.setAttribute("zlotys",zlotys);
		
		getServletContext().getRequestDispatcher("/dzien_4_mvc_1.jsp").forward(request, response);
	}

}
