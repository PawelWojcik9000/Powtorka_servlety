package dzien_2_servlety_GET;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_04")
public class Servlet_GET_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String param = request.getParameter("page");
		if(param == null) response.getWriter().append("wartość nie została przesłana");
		else {
			int num = Integer.parseInt(param);
			for(int i=1; i<=num; i++) {
				Integer iter = i;
				if(num % i == 0) {
					response.getWriter().append("wartość została przesłana");
					response.getWriter().append(iter.toString()+"<br>");
				}
			}
		}
	}

}
