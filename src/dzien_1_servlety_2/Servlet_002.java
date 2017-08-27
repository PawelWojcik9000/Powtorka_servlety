package dzien_1_servlety_2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet_002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String param;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		param = config.getInitParameter("myParam");
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append(param);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
