package dzien_2_servlety_POST;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;


@WebServlet("/Servlet_POST_02")
public class Servlet_POST_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String formText = request.getParameter("formText");
		String consequences = request.getParameter("consequences");
		String[] words = formText.split(" ");
		List<String> badwords = Arrays.asList(new String[] {"dupa1", "dupa2",  "dupa3"});
		String censored = "";
		if(consequences != null) response.getWriter().append(formText);
		else {
			for(String str : words) {
				if(badwords.contains(str)) censored += StringUtils.repeat("*", str.length())+" ";
				else censored += str+" ";
			}
			response.getWriter().append(censored);
		}
	}

}
