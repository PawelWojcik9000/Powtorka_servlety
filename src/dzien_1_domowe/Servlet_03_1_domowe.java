package dzien_1_domowe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_03_1_domowe")
public class Servlet_03_1_domowe extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<a href='Servlet_03_2_domowe?id=0'>Andruino</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=1'>ASUS</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=2'>iPhone</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=3'>Converse</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=4'>LG</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=5'>Samsung</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=6'>Alpine</a><br>"
				+ "<a href='Servlet_03_2_domowe?id=7'>60 Watt Led</a><br>");
	}

}
