package dzien_2_servlety_Sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_01_Del_Sessions")
public class Servlet_01_Del_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		if((int) sess.getAttribute("counter") == 1) {
			sess.invalidate();
			response.getWriter().append("usunieto sesje");
		}
	}

}
