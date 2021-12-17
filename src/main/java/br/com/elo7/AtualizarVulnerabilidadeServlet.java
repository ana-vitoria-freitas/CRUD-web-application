package br.com.elo7;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/atualizarVulnerabilidadeServlet")
public class AtualizarVulnerabilidadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldInitials = request.getParameter("oldInitials");
        String newInitials = request.getParameter("newInitials");
        String newName = request.getParameter("newName");
        
        Banco.updateVulnerabilidade(oldInitials, newName, newInitials);
        
        response.sendRedirect("vulnerabilidadeServlet");
	}

}