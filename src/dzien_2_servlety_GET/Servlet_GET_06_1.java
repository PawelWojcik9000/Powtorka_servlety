package dzien_2_servlety_GET;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_06_1")
public class Servlet_GET_06_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String link = "http://localhost:8080/Powtorka_servlety/Servlet_GET_06_2";
		String key = "?year=";
		for(int i=0; i<=30; i++) {
			Integer year = i+1980;
			response.getWriter().append("<a href="+link+key+year.toString()+">YEAR "+year.toString()+"</a><br>");
		}
	}

}
