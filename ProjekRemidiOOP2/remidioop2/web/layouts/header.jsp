<%-- 
    Document   : header
    Created on : Jan 31, 2019, 7:35:36 PM
    Author     : MaySM
--%>

<%@page language= "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="aris">
    <link rel="icon" href="favicon.ico">

    <title>Welcome - OOP2</title>
     <script type="text/javascript">
        function ChangeColor(tableRow, highLight) {
                if (highLight) {
                    tableRow.style.backgroundColor = '#B2EBF2';
                }else {
                    tableRow.style.backgroundColor = 'white';
                }
            }
    </script>
    <!-- Bootstrap core CSS -->
    <link href="/WEB-INF/stylesheets/jumbotron.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"  crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"  crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"   crossorigin="anonymous"></script>
    </head>
    <body>
    <% 
    if (session.getAttribute("current_user") !=null) { %>
        <jsp:include page="/layouts/navbar_logged_in.jsp" flush="true"/>
    <% } else { %> 
        <jsp:include page="/layouts/navbar_not_logged_in.jsp" flush="true"/>
      <% } %>

    