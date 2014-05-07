<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Business Company - Privacy Policy</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]><script type="text/javascript" src="unitpngfix.js"></script><![endif]-->
</head>
<body class="details">
<div class="wrap">
  <div class="header">
    <%@ include file="cabecerapagina.jsp" %>
  </div>
  <!--End of header-->
  <div class="main_content">
    <div class="wide_content">
      <h1>Ingreso al Sistema</h1>
      <p>    <form action="validar_usuario" method="post">
      <table width="100" border="0">
  <tr>
   <!-- <th scope="col">Tipo:</th>
    <th scope="col"><label for="select"></label>
      <select name="select" id="select">
        <option>Apoderado</option>
        <option>Secretaria</option>
        <option>Coordinador</option>
      </select></th>
    <th scope="col">&nbsp;</th>
    <th scope="col">&nbsp;</th>-->
  </tr>

         
  
  <tr>
    <th >Usuario:</th>
    <td><input type="text" class="contact_input"  name="codigo"/></td>
    <td scope="row">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <th scope="row">Contrase&ntilde;a:</th>
    <td><input type="text" class="contact_input"  name="codigo2"/></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <th scope="row">&nbsp;</th>
    <td><a href="recupera.html">Recuperar Contraseña</a></td>
    <td><input type="image" name="send" value="send" id="send" src="images/send.gif" class="send"/></td>
    <td>&nbsp;</td>
  </tr>
      </table>
</form>
      
        <br />
      </p>
    </div>
    <!--End of wide_content-->
    <div class="clear"></div>
  </div>
  <!--End of main_content-->
</div>
<!--End of wrap-->
<div class="footer">
<%@ include file="footer.jsp" %>
<!--End of footer-->
 <%@ include file="endFooter.jsp" %>
</html>
