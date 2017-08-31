package dzien_2_domowe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_2_domowe_d2")
public class Servlet_05_2_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		String[][] basket = (String[][]) sess.getAttribute("basket");
		double sum = 0;
		double check = 0;
		
		try {
			for(int i=0; i<basket.length; i++) {
				String productName = basket[i][0];
				int productAmount = Integer.parseInt(basket[i][1]);
				Double productPrice = Double.parseDouble(basket[i][2]);
				sum = productAmount * productPrice;
				response.getWriter().append(productName+" - "+productAmount+" * "+productPrice+" = "+sum+"<br>");
				check += sum;
			}
			response.getWriter().append("SUMA: "+check);
		} catch (NumberFormatException e) {
			response.getWriter().append("Ilosc i cena maja byc liczbami");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
