package dzien_1_servlety_2;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_004")
public class Servlet_004 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String ip = request.getRemoteAddr();
		String userAgent = request.getHeader("User-Agent");
		String userAgentToLowerCase = userAgent.toLowerCase(); 		
		String browser = "";
		Date date = new Date();
		GregorianCalendar gcalendar = new GregorianCalendar();
		String dateStr = date.toString();
		response.getWriter().append(ip+"<br>");
		response.getWriter().append(userAgent+"<br>");
		if(userAgentToLowerCase.contains("msie")) browser = "Przegladarka to Internet Explorer";
		else if(userAgentToLowerCase.contains("firefox")) browser = "Przegladarka to Firefox";
		else if(userAgentToLowerCase.contains("chrome")) browser = "Przegladarka to Google Chrome";
		else if(userAgentToLowerCase.contains("safari")) browser = "Przegladarka to Safari";
		else if(userAgentToLowerCase.contains("opera")) browser = "Przegladarka to Opera";
		else browser = "Nieznana przegladarka";
		response.getWriter().append(browser+"<br>");
		response.getWriter().append(dateStr+"<br>");
		response.getWriter().append(gcalendar.get(Calendar.HOUR) + ":");
		response.getWriter().append(gcalendar.get(Calendar.MINUTE) + ":");
		response.getWriter().append(gcalendar.get(Calendar.SECOND)+"<br>");
		
	}

}
