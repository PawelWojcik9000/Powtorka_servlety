package dzien_2_servlety_Sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_03_Add_Sessions")
public class Servlet_03_Add_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='POST'>"
				+ "<label>Klucz:<input type='text' name='key'></label>"
				+ "<label>Wartość: <input type='text' name='value'></label>"
				+ "<input type='submit'></form>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		sess.setAttribute(key, value);
	}

}
