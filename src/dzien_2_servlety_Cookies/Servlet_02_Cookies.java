package dzien_2_servlety_Cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_02_Cookies")
public class Servlet_02_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='POST'>"
				+ "<label>Klucz:<input type='text' name='key'></label>"
				+ "<label>Wartość:<input type='text' name='value'></label>"
				+ "<input type='submit'>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		Cookie newCookie = new Cookie(key, value);
		response.addCookie(newCookie);
		response.getWriter().append("Dodano nowe ciasteczko o nazwie: "+key+" i wartosci: "+value);
	}

}
