package dzien_4_servlety_MVC;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_05_MVC_1")
public class Servlet_05_MVC_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='post'>"
				+ "<label>Title: <input type='text' name='title'></label>"
				+ "<label>Author: <input type='text' name='author'></label>"
				+ "<label>ISBN: <input type='text' name='isbn'></label>"
				+ "<input type='submit' value='OK'></form>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String isbn = request.getParameter("isbn");
		
		Book book = new Book(title, author, isbn);
		
		HttpSession sess = request.getSession();
		sess.setAttribute("book", book);
		response.getWriter().append("Dodano ksiazke do sesji");
		
	}

}
