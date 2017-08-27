package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteCookie")
public class Servlet_01_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			if("User".equals(c.getName())) {
				c.setMaxAge(0);
				response.addCookie(c);
				response.getWriter().append("usunieto ciasteczko");
			} else response.getWriter().append("Nie ma takiego ciasteczka");
		}
	}

}
