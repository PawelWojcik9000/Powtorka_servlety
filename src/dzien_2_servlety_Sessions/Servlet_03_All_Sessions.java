package dzien_2_servlety_Sessions;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_03_All_Sessions")
public class Servlet_03_All_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		Enumeration names = sess.getAttributeNames();
		response.getWriter().append("<table>");
		while(names.hasMoreElements()) {
			String key = (String) names.nextElement();
			response.getWriter().append("<tr>"
					+ "<td>"+key+"</td>"
					+ "<td>"+sess.getAttribute(key)+"</td>"
					+ "</tr>");
		}
		response.getWriter().append("</table>");
	}

}
