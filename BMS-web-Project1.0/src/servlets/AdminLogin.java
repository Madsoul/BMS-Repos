package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AdministradorBean;

import dao.interfaces.AdministradorDao;
import daofactory.DaoFactory;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		HttpSession sesion = request.getSession();
		sesion.removeAttribute("id");
		sesion.removeAttribute("nombre");

		response.sendRedirect("admin/index.jsp");
		
		//sesion.invalidate();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out = response.getWriter();
		try {
			
			
			AdministradorBean datos=new AdministradorBean();
			
			datos.setUsuario(request.getParameter("txt_user"));
			datos.setClave(request.getParameter("txt_pass"));
			System.out.print(request.getParameter("txt_user"));
			System.out.print(request.getParameter("txt_pass"));
			
			DaoFactory dao = DaoFactory.getDAOFactory(DaoFactory.MYSQL);
			AdministradorDao admindao = dao.getAdministradorDao();
			AdministradorBean adminbean = admindao.validar(datos);
			
			if(adminbean == null){
				
				request.setAttribute("mensaje", "datos incorrectos");
				getServletContext().getRequestDispatcher("/admin/index.jsp")
													.forward(request, response);
			}else{
				HttpSession sesion = request.getSession();
				
					sesion.setAttribute("id",  adminbean.getId());
					sesion.setAttribute("nombre",  adminbean.getNombres());
					
					if(adminbean.getNivel()==2){
						response.sendRedirect("admin/escritorioAdmin2.jsp");
					}else{
					response.sendRedirect("admin/escritorio.jsp");
					}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			out.print(e.getMessage());
		}
	}

}
