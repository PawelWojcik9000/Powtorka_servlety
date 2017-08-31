package dzien_2_domowe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04_domowe_d2")
public class Servlet_04_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Cookie[] cookies = request.getCookies();
		boolean visited = false;
		for(Cookie c : cookies) {
			if("visits".equals(c.getName())) visited = true;
		}
		if(visited) {
			for(Cookie c : cookies) {
				Integer visits = Integer.parseInt(c.getValue());
				response.getWriter().append("Witaj, odwiedziłeś nas już "+visits+" razy");
				visits++;
				c.setValue(visits.toString());
				c.setMaxAge(3600*24*365);
				response.addCookie(c);
			}
			
		} else {
			response.getWriter().append("Witaj pierwszy raz na naszej stronie");
			Cookie cookie = new Cookie("visits", "1");
			cookie.setMaxAge(3600*24*365);
			response.addCookie(cookie);
		}
				
			
		
	}

}
