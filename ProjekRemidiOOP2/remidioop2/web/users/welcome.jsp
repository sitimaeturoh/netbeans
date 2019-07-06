<%-- 
    Document   : list
    Created on : Jan 30, 2019, 1:28:42 PM
    Author     : MaySM
--%>
<link href="/WEB-INF/stylesheets/login.css" rel="stylesheet">
<link href="/WEB-INF/stylesheets/jumbotron.css" rel="stylesheet">

<%@include file= "/layouts/header.jsp" %>
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <div class="text-md-center"
        <% if (session.getAttribute("current_user") !=null) { %>
            <h1 class="h3 mb-3 font-weight-normal text-md-center">Selamat..!</h1>
        <% out.println("Anda Login Dengan User: " + session.getAttribute("current_user")); %>
        <% } else { %> 
             <h1 class="h3 mb-3 font-weight-normal text-md-center">LOGIN GAGAL..!</h1>
          <% } %>
    </div>
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />      
    <br />
    
<%@include file= "/layouts/footer.html" %>
