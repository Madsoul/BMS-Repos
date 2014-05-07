<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Business Company - Contact Us</title>
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
    <div class="left_content">
      <h1>CONTACTENOS</h1>
      <div class="contact_form">
        <div class="form_row">
          <label class="contact">De:</label>
          <input type="text" class="contact_input" />
        </div>
        <div class="form_row">
          <label class="contact">email:</label>
          <input type="text" class="contact_input" />
        </div>
        <div class="form_row">
         <!-- <label class="contact">Para:</label>
          <select name="select" id="select">
<option>Secretaria</option>
<option>Apoderado</option>
            <option>Coordinador</option>
          </select>-->
        </div>
        <div class="form_row">
          <label class="contact">MENSAJE:</label>
          <textarea class="contact_textarea" rows="" cols="" ></textarea>
        </div>
        <div class="form_row"><img src="images/contacto.png" width="144" height="123" /></div>
      </div>
    </div>
    <!--End of left_content-->
    <div class="right_content">
      <h1>INFORMACION</h1>
      <div class="contact_info">
        <p class="info_contact">Cualquier Duda contactar con nuestro Jefe de Proyecto</p>
        <p class="info_contact">Nuestro horario de atenciòn es de Lunes a Viernes de 7:30 a.m a 12:00 m.d y de 1:00&nbsp;a 6:00 p.m.</p>
<p class="info_contact">&nbsp;</p>
      </div>
      <div class="contact_info"> <span class="orange">Email:</span>
        <p class="info_contact"> christian_girano@usmp.pe </p>
      </div>
      <div class="contact_info"> <span class="orange">Telefono:</span>
        <p class="info_contact"> 954176993</p>
      </div>
      <div class="employe_box_left"> 
        <p><span class="blue">Nombre del Empleado</span></p>
        <p>Diego Echeverria - <br />
          <span class="orange">Email:</span> diego_echeverria@usmp.pe<br />
          <br />
        <img src="images/contact_thumb1.gif" alt="" /></p>
</div>
    </div>
    <!--End of right_content-->
    <div class="clear"></div>
  </div>
  <!--End of main_content-->
</div>
<!--End of wrap-->
<div class="footer">
  <%@ include file="footer.jsp" %>
  </div>
  <!--End of footer_content-->
</div>
<!--End of footer-->
 <%@ include file="endFooter.jsp" %>

</html>
