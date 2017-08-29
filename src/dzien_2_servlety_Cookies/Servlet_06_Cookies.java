package dzien_2_servlety_Cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_06_Cookies")
public class Servlet_06_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String textColor = request.getParameter("textColor");
		String backgroundColor = request.getParameter("backgroundColor");
		Cookie colorOfText = new Cookie("colorOfText", textColor);
		response.addCookie(colorOfText);
		Cookie colorOfBackground = new Cookie("colorOfBackground", backgroundColor);
		response.addCookie(colorOfBackground);
		response.getWriter().append("<body bgcolor='"+colorOfBackground.getValue()+"'>"
				+ "<font color='"+colorOfText.getValue()+"'>Wybrałeś kolor tekstu jako: "+textColor+", oraz tła jako: "+backgroundColor+". "
				+ "Twój wybór został zapisane w ciasteczku.</font><br>");
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String textColor = request.getParameter("textColor");
		String backgroundColor = request.getParameter("backgroundColor");		
		Cookie[] cookies = request.getCookies();
		if(textColor == null && backgroundColor == null && cookies != null) {
			for(Cookie c : cookies) {
				if("colorOfText".equals(c.getName())) textColor = c.getValue();
			}
			for(Cookie c : cookies) {
				if("colorOfBackground".equals(c.getName())) backgroundColor = c.getValue();
			}
			response.getWriter().append("Zapamiętany w ciasteczku kolor tekstu to: "+textColor+", "
					+ "oraz tła jako: "+backgroundColor);
		}
		if(textColor == null && backgroundColor == null && cookies == null) {
			response.sendRedirect("index_cookies_6.html");
		}
	}

}


