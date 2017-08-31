package dzien_2_servlety_Sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Servlet_08_Sessions")
public class Servlet_08_Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String[] countries = { "Niemcy", "Czechy", "Slowacja" };
	String[] cities = { "Berlin", "Praga", "Bratyslawa" };
	int count = 0;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
