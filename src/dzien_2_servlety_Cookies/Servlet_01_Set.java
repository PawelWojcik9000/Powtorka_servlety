package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01_Set
 */
@WebServlet("/setCookie")
public class Servlet_01_Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie User = new Cookie("User", "CodersLab");
		User.setMaxAge(3600*24);
		resp.addCookie(User);
		
	}

}
