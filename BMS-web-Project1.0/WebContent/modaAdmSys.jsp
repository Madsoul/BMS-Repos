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
      <h1>Reporte de Gestión </h1>
      <p> <form>
      <table width="749" border="0">
      
  <tr>
      <th width="118" scope="col">Código </th>
    <th width="189" scope="col"><input type="text" /></th>
    <th width="147"><select name="select" id="select">
		<option>- Secretaria</option>
		<option>- Coordinador</option>
        <option>- Director</option>
          </select></th>
    
    </tr>

         
  
  <tr>
    <td></td>
    <td scope="row"></td>
    <td></td>
   
    </tr>
  
  <tr>
    <td><input type="image" name="send" value="send" id="send" src="images/crear.gif" class="send"/></td>
    <td><input type="image" name="send" value="send" id="send" src="images/modi.gif" class="send"/></td>
  

    <td><input type="image" name="send" value="send" id="send" src="images/elimina.gif" class="send"/></td>
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
</div>
<!--End of footer-->
 <%@ include file="endFooter.jsp" %>
</html>
