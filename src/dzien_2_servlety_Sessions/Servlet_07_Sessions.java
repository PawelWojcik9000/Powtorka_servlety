package dzien_2_servlety_Sessions;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_07_Sessions")
public class Servlet_07_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Random rand = new Random();
	int num1 = rand.nextInt(980)+20;
	int num2 = rand.nextInt(980)+20;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().append("<form action='' method='post'>"
		+num1+" + "+num2+" = <input type='text' name='add'><br>"
		+num1+" - "+num2+" = <input type='text' name='sub'><br>"
		+num1+" * "+num2+" = <input type='text' name='mul'><br>"
		+"<input type='submit' value='OK'></form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		sess.setAttribute("added", request.getParameter("add"));
		sess.setAttribute("subtracted", request.getParameter("sub"));
		sess.setAttribute("multiplied", request.getParameter("mul"));
		
		if(num1 + num2 == Integer.parseInt((String)sess.getAttribute("added"))) {
			response.getWriter().append(num1+" + "+num2+" = "+Integer.parseInt((String)sess.getAttribute("added"))+" Correct<br>");
		} else response.getWriter().append(num1+" + "+num2+" = "+Integer.parseInt((String)sess.getAttribute("added"))+" Wrong<br>");
		if(num1 - num2 == Integer.parseInt((String)sess.getAttribute("subtracted"))) {
			response.getWriter().append(num1+" - "+num2+" = "+Integer.parseInt((String)sess.getAttribute("subtracted"))+" Correct<br>");
		} else response.getWriter().append(num1+" - "+num2+" = "+Integer.parseInt((String)sess.getAttribute("subtracted"))+" Wrong<br>");
		if(num1 * num2 == Integer.parseInt((String)sess.getAttribute("multiplied"))) {
			response.getWriter().append(num1+" * "+num2+" = "+Integer.parseInt((String)sess.getAttribute("multiplied"))+" Correct<br>");
		} else response.getWriter().append(num1+" * "+num2+" = "+Integer.parseInt((String)sess.getAttribute("multiplied"))+" Wrong<br>");
	}

}
