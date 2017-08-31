package dzien_1_domowe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_02_domowe")
public class Servlet_02_domowe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		if(gender.equals("M")) {
			response.getWriter().append("Servlet wita Pana "+name);
		} else response.getWriter().append("Servlet wita Pania "+name);
	}

}
