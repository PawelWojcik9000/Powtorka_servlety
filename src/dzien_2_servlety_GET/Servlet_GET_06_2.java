package dzien_2_servlety_GET;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_06_2")
public class Servlet_GET_06_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String link = "http://localhost:8080/Powtorka_servlety/Servlet_GET_06_3";
		String year = request.getParameter("year");		
		Random rand = new Random();
		
		for(int i=1; i<=5; i++) {
			Integer mix = rand.nextInt(20)-10;
			String keys = "?year="+year+"&mix="+mix.toString();
			response.getWriter().append("<a href="+link+keys+">LINK "+i+"</a><br>");
		}
	}

}
