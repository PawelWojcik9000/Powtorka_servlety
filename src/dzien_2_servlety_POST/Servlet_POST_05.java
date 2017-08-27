package dzien_2_servlety_POST;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_POST_05")
public class Servlet_POST_05 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Double degrees = Double.parseDouble(request.getParameter("degrees"));
		String convertionType = request.getParameter("convertionType");
		Double fahrenheit = 32+(9*degrees)/5;
		Double celcius = 5*(degrees-32)/9;
		if(convertionType.equals("celcToFahr")) response.getWriter().append(fahrenheit.toString());
		else if(convertionType.equals("FahrToCelc")) response.getWriter().append(celcius.toString());
		else response.getWriter().append("Cos poszlo nie tak, sprobuj ponownie");
	}

}
