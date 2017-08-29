package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_05_2_Cookies")
public class Servlet_05_2_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cookieValue = request.getParameter("visited");
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			if(c.getValue().equals(cookieValue)) {
				c.setMaxAge(0);
				response.addCookie(c);
				response.getWriter().append("Witamy na stronie Servlet_05_2_Cookies");
			} else {
				response.sendRedirect("Servlet_05_1_Cookies");
			}
		}
	}

}
