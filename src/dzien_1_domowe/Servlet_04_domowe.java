package dzien_1_domowe;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04_domowe")
public class Servlet_04_domowe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String[] strNumbers = request.getParameterValues("num");
		int[] numbers = new int[strNumbers.length];
		for(int i=0; i<strNumbers.length; i++) {
			numbers[i] = Integer.parseInt(strNumbers[i]);
		}
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		double avg = (double)sum/4;
		int multiply = numbers[0]*numbers[1]*numbers[2]*numbers[3];
		
		response.getWriter().append("Liczby: "+Arrays.toString(strNumbers)+"<br>");
		response.getWriter().append("Srednia: "+avg+"<br>");
		response.getWriter().append("Iloczyn: "+multiply);
	}

}
