package dzien_2_servlety_Cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_03_Cookies")
public class Servlet_03_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		int time = Integer.parseInt(request.getParameter("hours"))*3600;
		Cookie newCookie = new Cookie(key, value);
		newCookie.setMaxAge(time);
		response.addCookie(newCookie);
		response.getWriter().append("Dodano nowe ciasteczko o nazwie: "+key+",  wartosci: "+value+" i czasie zycia: "+time+" godzin");
	}

}
