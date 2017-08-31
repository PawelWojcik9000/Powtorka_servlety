package dzien_4_servlety_MVC;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04_MVC")
public class Servlet_04_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book book1 = new Book(request.getParameter("title1"), request.getParameter("author1"), request.getParameter("age1"));
		Book book2 = new Book(request.getParameter("title2"), request.getParameter("author2"), request.getParameter("age2"));
		Book book3 = new Book(request.getParameter("title3"), request.getParameter("author3"), request.getParameter("age3"));
		Book book4 = new Book(request.getParameter("title4"), request.getParameter("author4"), request.getParameter("age4"));
		Book book5 = new Book(request.getParameter("title5"), request.getParameter("author5"), request.getParameter("age5"));
		
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		request.setAttribute("books", books);
		getServletContext().getRequestDispatcher("/dzien_4_mvc_4_result.jsp").forward(request, response);
	}

}
