package dzien_2_servlety_GET;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_03")
public class Servlet_GET_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int width = 5; 
		int height = 10;
		width = Integer.parseInt(request.getParameter("width"));
		height = Integer.parseInt(request.getParameter("height"));
		for(int i=1; i<=width; i++) {			
			for(int j=1; j<=height; j++) {
				Integer sum = i*j;
				Integer iteri = i;
				Integer iterj = j;
				response.getWriter().append(iteri.toString()+" * "+iterj.toString()+" = "+sum.toString()+"<br>");
			}
		}
	}

}
