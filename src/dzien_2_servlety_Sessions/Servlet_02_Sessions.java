package dzien_2_servlety_Sessions;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet_02_Sessions")
public class Servlet_02_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<form action='' method='POST'>Ocena: <input type='text' name='grade'>"
				+ "<input type='submit'	value='Wyślij'></form>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		int grade = Integer.parseInt(request.getParameter("grade"));
		int[] grades = (int []) sess.getAttribute("grades");
		if(grade > 0 && grade < 7) {
			if(sess.getAttribute("grades") == null) {
				sess.setAttribute("grades", new int[] { grade });
			} else {
				sess.setAttribute("grades", addToGrades(grades, grade));
			}
		}
		response.getWriter().append(Arrays.toString(grades));
		response.getWriter().append("Srednia: "+countAvg(grades));
	}
	
	public double countAvg(int[] grades) {
		double sum = Arrays.stream(grades).sum();
		return sum / grades.length;
	}
	
	public int[] addToGrades(int[] grades, int grade) {
		int[] tmpGrades = Arrays.copyOf(grades, grades.length+1);
		tmpGrades[grades.length] = grade;
		return tmpGrades;
	}

}

