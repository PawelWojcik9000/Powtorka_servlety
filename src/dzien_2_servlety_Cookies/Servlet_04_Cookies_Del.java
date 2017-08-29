package dzien_2_servlety_Cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04_Cookies_Del")
public class Servlet_04_Cookies_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cookieName = request.getParameter("cookieName");
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals(cookieName)) {
				c.setMaxAge(0);
				response.addCookie(c);
				response.getWriter().append("usunieto ciasteczko o nazwie: "+c.getName());
			}
		}
	}

}
