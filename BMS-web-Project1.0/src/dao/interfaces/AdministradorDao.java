package dao.interfaces;

import java.util.Vector;

import beans.AdministradorBean;




public interface AdministradorDao {
	
	public AdministradorBean validar(AdministradorBean datos) 
			throws Exception;
	
	public AdministradorBean recuperar(AdministradorBean recuperar) throws Exception;
	
	public boolean CrearCuenta(AdministradorBean datos) throws Exception;
	
	public Vector<AdministradorBean>  listarAdministrador() throws Exception;
	
	public boolean eliminarAdmin(int id) throws Exception;
	
	public boolean actualizarAdmin(AdministradorBean datos) throws Exception;
	
	public AdministradorBean seleccionarAdminPorId(int id) throws Exception;
	
	
}
