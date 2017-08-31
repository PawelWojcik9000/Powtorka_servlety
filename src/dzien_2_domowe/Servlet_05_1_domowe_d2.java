package dzien_2_domowe;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_1_domowe_d2")
public class Servlet_05_1_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='POST'>"
				+ "Nazwa produktu: <input type='text' name='productname'><br>"
				+ "Ilosc: <input type='text' name='productamount'><br>"
				+ "Cena: <input type='text' name='productprice'><br>"
				+ "<input type='submit' value='OK'></form>"
				);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("productname");
		String amount = request.getParameter("productamount");
		String price = request.getParameter("productprice").replaceAll(",", ".");
		String[][] basket = new String[1][3];		
		HttpSession sess = request.getSession();
		boolean added = false;
		
		if(sess.getAttribute("basket") == null) {
			basket[0] = new String[] { name, amount, price };			
			sess.setAttribute("basket", basket);
			added = true;
		} else {
			String[][] tmpBasket = (String[][])sess.getAttribute("basket");
			String[][] newBasket = Arrays.copyOf(tmpBasket, tmpBasket.length+1);
			newBasket[tmpBasket.length] = new String[] { name, amount, price };
			sess.setAttribute("basket", newBasket);
			added = true;
		}
		if(added) {
			response.getWriter().append("Produkt dodany. Dodaj kolejny: <br>"
					+ "<form action='' method='POST'>"
					+ "Nazwa produktu: <input type='text' name='productname'><br>"
					+ "Ilosc: <input type='text' name='productamount'><br>"
					+ "Cena: <input type='text' name='productprice'><br>"
					+ "<input type='submit' value='OK'></form><br>"
					+ "<a href='Servlet_05_2_domowe_d2'>Pokaz koszyk</a>");
		} else response.getWriter().append("Cos poszlo nie tak");
	}

}
