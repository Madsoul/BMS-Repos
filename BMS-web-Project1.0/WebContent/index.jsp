<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Business Company</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]><script type="text/javascript" src="unitpngfix.js"></script><![endif]-->
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
function hideall() {
	$("#tab").hide();
	$("#tab1").hide();
	$("#tab2").hide();
	$("#tab3").hide();
	$("#tab4").hide();			
}
$(document).ready(function(){

$("#icon1").mouseover(function () {
hideall();
$("#tab1").css("display","block");     
});

$("#icon2").mouseover(function () {
hideall();
$("#tab2").css("display","block");     
});

$("#icon3").mouseover(function () {
hideall();
$("#tab3").css("display","block");     
});  

hideall();
$("#tab").show();       

  });
</script>
</head>
<body>
<div class="wrap">
  <div class="header">
  
  <%@ include file="cabecerapagina.jsp" %>
    
  </div>
  <!--End of header-->
  <div class="home_center_content">
    <div class="home_center_content">
    
    
      <div class="box1" id="tab">
      
         <%@ include file="box1Tab.jsp" %>
      
      
      </div>
      
      <div class="box1" id="tab1">
               
     	 <%@ include file="box1Tab1.jsp" %>
     	 </div>
     	 
      <div class="box1" id="tab2">
       	 <%@ include file="box1Tab2.jsp" %>
       	  </div>
       
      <div class="box1" id="tab3">
       	 <%@ include file="box1Tab3.jsp" %>
        
      </div>
      
       <%@ include file="Icon.jsp" %>
     
    
  </div>
  </div>

  
  <!--End of home_center_content-->
  
  
  <div class="main_content">
    <div class="left_content">
      <h1>Acerca del Sistema</h1>
      <p> La instituci�n Privada IEP "San Nicolas", se encarga del desarrollo de los ni�os de una manera psicol�gica, motriz y relacional, la cual permite que el ni�o o la ni�a puedan desenvolverse de una manera m�s r�pida y eficaz. <br />
        <br />
      Este problema surge a partir de que no se cuenta con un informe acerca del listado de �tiles, siempre se genera dudas si los �tiles de los educandos estas completos o no. 
Por lo tanto BOSS-Management Solution va a dise�ar a pedido de la Instituci�n IEP "MATER PURISSIMA" un software que permita verificar el estado de los �tiles escolares, as� como tambi�n el cumplimiento de estos para sus futuras actividades,  permitiendo gestionar estas tareas con un menor costo.
 </p>
      <h1></h1>
      <p>  </p>
      <div class="newsletter"></div>
      </div>
      
      
   
    <!--End of left_content-->
    <div class="right_content">
      <h1></h1>
      <div class="project_box"> <a href="http://all-free-download.com/free-website-templates/"><img src="images/latest_project.jpg" alt="" border="0" class="feat_project" /></a>
        <div class="project_details"> <span class="left">project details</span> <a href="http://all-free-download.com/free-website-templates/" class="view">view project</a> </div>
      </div>
      <h1 class="orange"></h1>
      <div class="news_box"> 
        <p class="news_content">  </p>
      </div>
      <div class="news_box"> 
        <p class="news_content">  </p>
      </div>
    </div>
    
    
    <!--End of right_content-->
    <div class="clear"></div>
   </div>
  <!--End of main_content-->
</div>


<!--End of wrap-->
<!---*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-->
 
<div class="footer">
<%@ include file="footer.jsp" %>
  
    
</div>
  <!--End of footer_content-->
</div>
<!--End of footer-->
 <%@ include file="endFooter.jsp" %></body>
</html>
