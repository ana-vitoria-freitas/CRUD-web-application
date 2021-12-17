package br.com.elo7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vulnerabilidadeServlet")
public class VulnerabilidadeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Map<String, String> vulnerabilidades = Banco.getVulnerabilidades();
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("listaVulnerabilidades.jsp");
		req.setAttribute("vulnerabilidades", vulnerabilidades);
		requestDispatcher.forward(req, resp);
	}
}
