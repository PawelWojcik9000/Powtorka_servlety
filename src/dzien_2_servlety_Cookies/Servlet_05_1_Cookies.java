package dzien_2_servlety_Cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_05_1_Cookies")
public class Servlet_05_1_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Cookie visited = new Cookie("visited", "yes");
		response.addCookie(visited);
		response.getWriter().append("<a href='Servlet_05_2_Cookies?"+visited.getName()+"="+visited.getValue()+"'>Link do Servlet_05_2_Cookies</a>");
	}

}
