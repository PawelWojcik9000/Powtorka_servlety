package dzien_2_domowe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_03_domowe_d2")
public class Servlet_03_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		String one = "";	String two = "";	String three = "";	String four = "";	String five = "";
				
		if(!sess.isNew()) {
			one = (String) sess.getAttribute("1");
			two = (String) sess.getAttribute("2");
			three = (String) sess.getAttribute("3");
			four = (String) sess.getAttribute("4");
			five = (String) sess.getAttribute("5");
		}
		response.getWriter().append("<form action='' method='POST'>"
				+ "1: <input type='text' name='1' value='"+one+"'><br>"
				+ "2: <input type='text' name='2' value='"+two+"'><br>"
				+ "3: <input type='text' name='3' value='"+three+"'><br>"
				+ "4: <input type='text' name='4' value='"+four+"'><br>"
				+ "5: <input type='text' name='5' value='"+five+"'><br>"
				+ "<input type='submit' value='Submit'>"
				+ "</form> ");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String one = request.getParameter("1");
		String two = request.getParameter("2");
		String three = request.getParameter("3");
		String four = request.getParameter("4");
		String five = request.getParameter("5");
		
		HttpSession sess = request.getSession();
		sess.setAttribute("1", one);
		sess.setAttribute("2", two);
		sess.setAttribute("3", three);
		sess.setAttribute("4", four);
		sess.setAttribute("5", five);
	}

}
