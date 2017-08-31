package dzien_1_domowe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_05_domowe")
public class Servlet_05_domowe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list.add(rand.nextInt(100));
		}
		response.getWriter().append(""+list+"<br>");
		Collections.sort(list);
		response.getWriter().append(""+list);
	}

}
