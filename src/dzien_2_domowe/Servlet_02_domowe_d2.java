package dzien_2_domowe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_02_domowe_d2")
public class Servlet_02_domowe_d2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String binary = request.getParameter("binary");
		String[] binarySplit = binary.split("");
		
		int binaryNums;
		boolean isValid = false;
		for(String str : binarySplit) {
			if(str.equals("0") || str.equalsIgnoreCase("1")) isValid = true;			
		}
		if(isValid) {
			binaryNums = Integer.parseInt(binary, 2);
			response.getWriter().append("Decimal: "+binaryNums);
		} else response.getWriter().append("To powinien byc ciag zer i jedynek");		
	}

}
