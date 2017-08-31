package dzien_4_servlety_MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_03_MVC")
public class Servlet_03_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String isbn = request.getParameter("isbn");
		
		Book book = new Book(title, author, isbn);
		request.setAttribute("book", book);
		getServletContext().getRequestDispatcher("/dzien_4_mvc_3_result.jsp").forward(request, response);
		
	}
	
	

}
