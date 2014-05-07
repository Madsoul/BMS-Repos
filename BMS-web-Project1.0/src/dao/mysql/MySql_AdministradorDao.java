package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;



import beans.AdministradorBean;


import dao.interfaces.AdministradorDao;
import daofactory.MySqlDaoFactory;

public class MySql_AdministradorDao extends MySqlDaoFactory implements AdministradorDao {

	@Override
	public AdministradorBean validar(AdministradorBean datos)
			throws Exception {

AdministradorBean adminbean = null;
		
		try {
			Connection con = MySqlDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from administrador where " +
												"usuario= '"+datos.getUsuario()+"' and " +
												"clave = '"+datos.getClave()+"'");
			
		
			if(rs.next()){
				
				System.out.print(datos.getUsuario());
				System.out.print(datos.getClave());
				adminbean = new AdministradorBean();
				adminbean.setId( rs.getInt("idadm"));
				adminbean.setNombres( rs.getString("nombre"));
				adminbean.setNivel(rs.getInt("nivel"));
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return adminbean;
	}

	@Override
	public AdministradorBean recuperar(AdministradorBean recuperar)
			throws Exception {
		 
		
		AdministradorBean admin=null;
		try {
			Connection con = MySqlDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select usuario, clave from administrador where "+
												"usuario='"+recuperar.getUsuario()+"'and "+
												"pregunta='"+recuperar.getPregunta()+"'and "+
												"respuesta='"+recuperar.getRespuesta()+"'");
			if(rs.next()){
				
				admin= new AdministradorBean();
		
				admin.setUsuario(rs.getString("usuario"));
				admin.setClave(rs.getString("clave"));
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return admin;
	}

	@Override
	public boolean CrearCuenta(AdministradorBean datos) throws Exception {
boolean flag = false;
		
		try {
			Connection con = MySqlDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			
			int i =	stmt.executeUpdate("insert into administrador (nombre, apellido, usuario, clave, direccion, email, pregunta, respuesta, nivel) " +
								"values ('"+datos.getNombres()+"','"+datos.getApellidos()+"'," +
										"'"+datos.getUsuario()+"','"+datos.getClave()+"'," +
												"'"+datos.getDireccion()+"','"+datos.getEmail()+"'," +
														"'"+datos.getPregunta()+"','"+datos.getRespuesta()+"'," +
																"'"+datos.getNivel()+"')");
			
			if(i==1){
				flag=true;
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return flag;
	}

	
	public Vector<AdministradorBean> listarAdministrador() throws Exception {
		Vector<AdministradorBean> administrador = null;
		try {
			Connection con = MySqlDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from administrador");
			
			administrador = new Vector<AdministradorBean>();
			while(rs.next()){
				AdministradorBean admin = new AdministradorBean();
				admin.setId(rs.getInt("idadm"));
				admin.setNombres(rs.getString("nombre"));
				admin.setPregunta(rs.getString("pregunta"));
				admin.setRespuesta(rs.getString("respuesta"));
				admin.setApellidos(rs.getString("apellido"));
				admin.setClave(rs.getString("clave"));
				admin.setDireccion(rs.getString("direccion"));
				admin.setEmail(rs.getString("email"));
				admin.setNivel(rs.getInt("nivel"));
				admin.setUsuario(rs.getString("usuario"));
				
				
				
				administrador.add(admin);
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return administrador;
	}

	@Override
	public boolean eliminarAdmin(int id) throws Exception {
	
		
		boolean flag = false;
		try {
			Connection conexion = MySqlDaoFactory.obtenerConexion();
			Statement stmt = conexion.createStatement();
			String consulta = "delete from administrador " +
					"where idadm="+id;
			int filas = stmt.executeUpdate(consulta);
			if(filas == 1){
				flag = true;
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return flag;
	}

	@Override
	public boolean actualizarAdmin(AdministradorBean datos) throws Exception {
		boolean flag = false;
		try {
			Connection conexion = MySqlDaoFactory.obtenerConexion();
			Statement stmt = conexion.createStatement();
			String consulta = "update administrador " +
					"set nombre='"+datos.getNombres()+"'," +
					"apellido='"+datos.getApellidos()+"'," +
					"usuario='"+datos.getUsuario()+"'," +
					"clave='"+datos.getClave()+"'," +
					"direccion='"+datos.getDireccion()+"'," +
					"email='"+datos.getEmail()+"'," +
					"pregunta='"+datos.getPregunta()+"'," +
					"respuesta='"+datos.getRespuesta()+"'," +
					"nivel='"+datos.getNivel()+"'" +
					
					"where idadm="+datos.getId();
			
			
			int filas = stmt.executeUpdate(consulta);
			if(filas == 1){
				flag = true;
			}
	

			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return flag;
	}

	@Override
	public AdministradorBean seleccionarAdminPorId(int id) throws Exception {
		AdministradorBean admin = null;
		try {
			Connection conexion = MySqlDaoFactory.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "select * from administrador where idadm = "+id;
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			if(rs.next()){
				admin = new AdministradorBean();
			admin.setId(rs.getInt("idadm"));
			admin.setNombres(rs.getString("nombre"));
				admin.setPregunta(rs.getString("pregunta"));
				admin.setRespuesta(rs.getString("respuesta"));
				admin.setApellidos(rs.getString("apellido"));
				admin.setClave(rs.getString("clave"));
				admin.setDireccion(rs.getString("direccion"));
				admin.setEmail(rs.getString("email"));
				admin.setNivel(rs.getInt("nivel"));
				admin.setUsuario(rs.getString("usuario"));
				

				
				
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return admin;
	}

	

}
