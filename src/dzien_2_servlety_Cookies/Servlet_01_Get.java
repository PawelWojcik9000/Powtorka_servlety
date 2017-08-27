package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showCookie")
public class Servlet_01_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String cookieValue = null;
		try {
			for(Cookie c : cookies) {
				if("User".equals(c.getName())) cookieValue = c.getValue();
			}
			//if(cookieValue == null) response.getWriter().append("Nie ma takiego ciasteczka");
			response.getWriter().append(cookieValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append("Nie ma takiego ciasteczka");
			
		}
	}

}
