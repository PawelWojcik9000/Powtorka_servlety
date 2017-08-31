package dzien_4_servlety_MVC;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_MVC_3")
public class Servlet_05_MVC_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		Book book = (Book) sess.getAttribute("book");
		response.getWriter().append(book.toString()+"<br>");
		Book[] books = (Book[]) sess.getAttribute("books");
		for(Book bookArr : books) {
			response.getWriter().append(bookArr.toString()+"<br>");
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
