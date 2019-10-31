<%-- 
    Document   : index
    Created on : 17/10/2019, 09:27:38
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
 
<html>
 <head>
 <title> JSP </title>
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <style type="text/css" >
   input, textarea, select {
      display: block;
      margin-bottom: 10px; 
   }
   /*div.sexo {
    display: inline;
   }*/
   input[type=radio], input[type=range], input[type=date],input[type=checkbox]{
      display: inline;
   }
 </style>
 </head>

 <body>
    <%@include file="WEB-INF/jspf/menutop.jspf" %>
    <h2> Hello World</h2>
  <h1> JSP </h1> 
 </body>
</html>
