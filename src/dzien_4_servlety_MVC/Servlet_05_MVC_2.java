package dzien_4_servlety_MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_MVC_2")
public class Servlet_05_MVC_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='POST'>"
				+"<label>Title_1: <input type='text' name='title1'></label>"
				+"<label>Author_1: <input type='text' name='author1'></label>"
				+"<label>ISBN_1: <input type='text' name='isbn1'></label><br>"
	
				+"<label>Title_2: <input type='text' name='title2'></label>"
				+"<label>Author_2: <input type='text' name='author2'></label>"
				+"<label>ISBN_2: <input type='text' name='isbn'></label><br>"
	
				+"<label>Title_3: <input type='text' name='title3'></label>"
				+"<label>Author_3: <input type='text' name='author3'></label>"
				+"<label>ISBN_3: <input type='text' name='isbn3'></label><br>"
				
				+"<input type='submit' value='OK'></form>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book book1 = new Book(request.getParameter("title1"), request.getParameter("author1"), request.getParameter("isbn1"));
		Book book2 = new Book(request.getParameter("title2"), request.getParameter("author2"), request.getParameter("isbn2"));
		Book book3 = new Book(request.getParameter("title3"), request.getParameter("author3"), request.getParameter("isbn3"));
		
		Book[] books = new Book[3];
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		HttpSession sess = request.getSession();
		sess.setAttribute("books", books);
		response.getWriter().append("Dodano ksiazki do sesji");
	}

}
