package dzien_2_servlety_Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rememberMe")
public class Servlet_07_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("userName".equals(c.getName())) response.getWriter().append("Czesc " + c.getValue() + ". "
						+ "Twoje dane wczytano z ciasteczka");
			}
		} else {
			response.getWriter().append("<form action='' method='POST'>" + "Twoje imie: <input type='text' name='userName'>"
							+ "Zapamietaj mnie <input type='checkbox' name='rememberUser' value='1'>"
							+ "<input type='submit' value='BENG!'>");

		}
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userName = request.getParameter("userName");
		String checkBox = request.getParameter("rememberUser");

		if (checkBox != null) {
			Cookie user = new Cookie("userName", userName);
			response.addCookie(user);
		}
		response.getWriter().append("Czesc " + userName);

	}

}
