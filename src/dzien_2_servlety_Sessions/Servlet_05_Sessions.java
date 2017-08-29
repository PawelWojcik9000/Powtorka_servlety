package dzien_2_servlety_Sessions;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_Sessions")
public class Servlet_05_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Random rand = new Random();
		int num1 = rand.nextInt(100);
		int num2 = rand.nextInt(100);
		HttpSession sess = request.getSession();
		sess.setAttribute("num1", num1);
		sess.setAttribute("num2", num2);
		response.getWriter().append("<form action='' method = 'post'>"
				+ "Imie: <input type='text' name='name'><br>"
				+ "Nazwisko: <input type='text' name='surname'><br>"
				+ "Mail: <input type='text' name='mail'><br>"
				+ "Wpisz ponizej sume: "+num1+" + "+num2+"<br>"
				+ "Captcha: <input type='text' name='captcha'><br>"
				+ "<input type='submit' value='OK'></form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		try {
			int num1 = (int) sess.getAttribute("num1");
			int num2 = (int) sess.getAttribute("num2");		
			int captcha = Integer.parseInt(request.getParameter("captcha"));
			if(num1+num2==captcha) response.getWriter().append("Zgadza sie");
			else response.getWriter().append("Nie zgadza sie");
		} catch (NumberFormatException e) {
			response.getWriter().append("Wynik musi byc liczba");
		}
	}

}
