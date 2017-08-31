package dzien_2_servlety_Sessions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_06_Sessions")
public class Servlet_06_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String img1 = null;
	String img2 = null;
	String img3 = null;
	String img4 = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
							
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession sess = request.getSession();
		
		if(sess.getAttribute("pagesVisited") == null) {			
			response.sendRedirect("index_6_sessions_wybor_1.html");	
			sess.setAttribute("pagesVisited", 1);
		} else if((int) sess.getAttribute("pagesVisited") == 1) {
			sess.setAttribute("choice1", request.getParameter("img1"));
			img1 = (String)sess.getAttribute("choice1");
			sess.setAttribute("pagesVisited", 2);
			response.sendRedirect("index_6_sessions_wybor_2.html");
		} else if((int) sess.getAttribute("pagesVisited") == 2) {
			sess.setAttribute("choice2", request.getParameter("img2"));
			img2 = (String)sess.getAttribute("choice2");
			sess.setAttribute("pagesVisited", 3);
			response.sendRedirect("index_6_sessions_wybor_3.html");
		} else if((int) sess.getAttribute("pagesVisited") == 3) {
			sess.setAttribute("choice3", request.getParameter("img3"));
			img3 = (String)sess.getAttribute("choice3");
			sess.setAttribute("pagesVisited", 4);
			response.sendRedirect("index_6_sessions_wybor_4.html");
		} else {
			sess.setAttribute("choice4", request.getParameter("img4"));
			img4 = (String)sess.getAttribute("choice4");			
			sess.setAttribute("pagesVisited", null);
			String[] images = { img1,img2,img3,img4 };
			response.getWriter().append("Twoje wybory: <br>");
			for(int i=0; i<4; i++) {
				response.getWriter().append("Obrazek nr "+(i+1)+": "+images[i]+"<br>");
			}
		} 
	}

}
