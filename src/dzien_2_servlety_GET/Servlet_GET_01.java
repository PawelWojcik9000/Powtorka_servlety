package dzien_2_servlety_GET;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_GET_01")
public class Servlet_GET_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer start = null;
		Integer end = null;
		List<Integer> numbers;
		try {
			start = Integer.parseInt(request.getParameter("start"));
			end = Integer.parseInt(request.getParameter("end"));
			numbers = new ArrayList<>();
			for(int i=start; i<=end; i++) {
				numbers.add(i);
			}
			response.getWriter().append(numbers.toString());
		} catch (NumberFormatException e) {
			response.getWriter().append("Parametry sa puste");
			e.printStackTrace();
		}
		
	}

}
