package dzien_1_servlety_2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_005")
public class Servlet_005 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userAgent = request.getHeader("User-Agent");
		String userAgentToLowerCase = userAgent.toLowerCase(); 		
		String browser = "";
		if(userAgentToLowerCase.contains("msie")) browser = "Przegladarka to Internet Explorer";
		else if(userAgentToLowerCase.contains("firefox")) browser = "Przegladarka to Firefox";
		else if(userAgentToLowerCase.contains("chrome")) browser = "Przegladarka to Google Chrome";
		else if(userAgentToLowerCase.contains("safari")) browser = "Przegladarka to Safari";
		else if(userAgentToLowerCase.contains("opera")) browser = "Przegladarka to Opera";
		else browser = "Nieznana przegladarka";
		response.getWriter().append(browser+"<br>");
	}

}
