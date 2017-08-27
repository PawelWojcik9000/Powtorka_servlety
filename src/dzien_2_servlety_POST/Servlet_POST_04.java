package dzien_2_servlety_POST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;


@WebServlet("/Servlet_POST_03")
public class Servlet_POST_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Random rand = new Random();
		int num = rand.nextInt(5)+5;
		response.getWriter().append("<form action='' method='POST'>");
		for(int i=0; i<num; i++) {
			response.getWriter().append("<input name='numbers'/><br>");
		}
		response.getWriter().append("<input type='submit'/></form><br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] params = request.getParameterValues("numbers");
		int[] numbers = new int[params.length];
		for(int i=0; i<params.length; i++) {
			if(StringUtils.isNumeric(params[i])) numbers[i] = Integer.parseInt(params[i]);
		}
		Arrays.sort(numbers);
		List<Integer> sortedList = new ArrayList<>();
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] != 0) sortedList.add(numbers[i]);
		}
		response.getWriter().append(sortedList.toString());		
	}
	
	

}
