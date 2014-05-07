package beans;

public class AdministradorBean {
	
int id;
String nombres;
String apellidos;
String usuario;
String clave;
int nivel;
String pregunta;
String respuesta;
String direccion;
String email;

public String getDireccion() {
	return direccion;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getUsuario() {
	return usuario;
}
public String getPregunta() {
	return pregunta;
}
public void setPregunta(String pregunta) {
	this.pregunta = pregunta;
}
public String getRespuesta() {
	return respuesta;
}
public void setRespuesta(String respuesta) {
	this.respuesta = respuesta;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
} 



}
