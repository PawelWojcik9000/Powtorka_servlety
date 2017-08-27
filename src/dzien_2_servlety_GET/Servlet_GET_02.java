package dzien_2_servlety_GET;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_02")
public class Servlet_GET_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Map<String, String[]> getAll = request.getParameterMap();
		for (String keys : getAll.keySet()) {			
			String[] value = getAll.get(keys);
			for(String values : value) {
				response.getWriter().append("Key: "+keys+" | "+"Value: "+values+"<br>");
			}			
		}
	}

}
