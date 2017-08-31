package dzien_2_domowe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_01_domowe_d2")
public class Servlet_01_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String choice = request.getParameter("exchange");		
		Double howmuch;
		try {
			howmuch = Double.parseDouble(request.getParameter("amount").replaceAll(",", "."));
			double exchanged = 0;
			double[] courses = { 1,2,3,4,5,6 };
			if(choice.equals("eurusd")) exchanged = howmuch *  courses[0];
			if(choice.equals("usdeur")) exchanged = howmuch *  courses[1];
			if(choice.equals("eurpln")) exchanged = howmuch *  courses[2];
			if(choice.equals("plneur")) exchanged = howmuch *  courses[3];
			if(choice.equals("usdpln")) exchanged = howmuch *  courses[4];
			if(choice.equals("plnusd")) exchanged = howmuch *  courses[5];
			
			response.getWriter().append("Zmienione: "+exchanged);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			response.getWriter().append("To ma byc liczba");
		}
		
	}

}
