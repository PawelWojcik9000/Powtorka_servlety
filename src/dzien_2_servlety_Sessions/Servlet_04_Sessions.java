package dzien_2_servlety_Sessions;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_04_Sessions")
public class Servlet_04_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		
		String productName = request.getParameter("name");
		int productAmount = Integer.parseInt(request.getParameter("amount"));
		double productPrice = Integer.parseInt(request.getParameter("price"));
		
		String[] productNames = (String[]) sess.getAttribute("productnames");
		int[] productAmounts = (int[]) sess.getAttribute("productamounts");
		double[] productPrices = (double[]) sess.getAttribute("productprices");
		
		if(sess.getAttribute("productnames") == null) productNames = new String[] { productName };
		else productNames = addToProductNames(productNames, productName);
		sess.setAttribute("productnames", productNames);
		
		if(sess.getAttribute("productamounts") == null) productAmounts = new int[] { productAmount };
		else productAmounts = addToProductAmounts(productAmounts, productAmount);
		sess.setAttribute("productamounts", productAmounts);
		
		if(sess.getAttribute("productprices") == null) productPrices = new double[] { productPrice };
		else productPrices = addToProductPrices(productPrices, productPrice);
		sess.setAttribute("productprices", productPrices);
		
		for(int i=0; i<=productNames.length; i++) {
			response.getWriter().append("Product name: "+productNames[i]+" | Product amount: "+productAmounts[i]+" | Product price: "+productPrices[i]+"<br>");
		}
	}
	
	public String[] addToProductNames(String[] productNames, String productName) {
		String[] tmpProducsNames = Arrays.copyOf(productNames, productNames.length+1);
		tmpProducsNames[productNames.length] = productName;
		return tmpProducsNames;
	}
	
	public int[] addToProductAmounts(int[] productAmounts, int productAmount) {
		int[] tmpProductAmounts = Arrays.copyOf(productAmounts, productAmounts.length+1);
		tmpProductAmounts[productAmounts.length] = productAmount;
		return tmpProductAmounts;
	}
	
	public double[] addToProductPrices(double[] productPrices, double productPrice) {
		double[] tmpProductPrices = Arrays.copyOf(productPrices, productPrices.length+1);
		tmpProductPrices[productPrices.length] = productPrice;
		return tmpProductPrices;
	}

}
