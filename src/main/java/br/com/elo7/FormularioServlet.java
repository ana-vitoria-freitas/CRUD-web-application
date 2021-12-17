package br.com.elo7;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String initials = request.getParameter("initials");
        String name = request.getParameter("name");
        
        Banco.addVulnerabilidade(name, initials);
        
        response.sendRedirect("vulnerabilidadeServlet");
	}

}
