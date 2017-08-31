package dzien_1_domowe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Servlet_01_domowe", urlPatterns = { "/Servlet_01_domowe" })
public class Servlet_01_domowe extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = new String(Files.readAllBytes(Paths.get("/home/pawel/workspace/Powtorka_servlety/src/dzien_1_domowe/oop.txt")));
		response.setContentType("text/html;charset=uft-8");
		response.getWriter().append(str);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
