package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04_Cookies_Show")
public class Servlet_04_Cookies_Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Cookie[] cookies = request.getCookies();
		String cookieVal = null;
		try {
			for(Cookie c : cookies) {
				response.getWriter().append(c.getName()+"<a href='Servlet_04_Cookies_Del?cookieName="+c.getName()+"'>&nbspUSUN</a><br>");
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			response.getWriter().append("Nie ma zadnych ciasteczek");
		}
	}

}
