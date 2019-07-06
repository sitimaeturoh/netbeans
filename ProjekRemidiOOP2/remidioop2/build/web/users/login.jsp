<%-- 
    Document   : list
    Created on : Jan 30, 2019, 1:28:42 PM
    Author     : MaySM
--%>
<link href="/WEB-INF/stylesheets/login.css" rel="stylesheet">
<link href="/WEB-INF/stylesheets/jumbotron.css" rel="stylesheet">

<%@include file= "/layouts/header.jsp" %>

<%
   // Create cookies for first and last names.      
   Cookie email = new Cookie("email",
   request.getParameter("email"));
   Cookie password = new Cookie("password",
   request.getParameter("password"));
 
   // Set expiry date after 24 Hrs for both the cookies.
   email.setMaxAge(60*60*24); 
   password.setMaxAge(60*60*24); 
 
   // Add both the cookies in the response header.
   response.addCookie( email );
   response.addCookie( password );
%>
    <br />      
    <br />      
    <br />     
    <div class="container">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
        <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
                <form class="form-signin" action="users?action=do-login" method="POST">
                            <div class="form-group row">
                                <label <%= request.getParameter("email")%> for="email" class="col-md-4 col-form-label text-md-right">E-Mail </label>
                                <div class="col-md-8">
                                    <input type="text" id="inputEmail" class="form-control" name="email" placeholder="Email" required autofocus>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label <%= request.getParameter("password")%> for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                <div class="col-md-8">
                                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
                                </div>
                            </div>
                         <div class="form-group row">
                         <label>
                          <input type="checkbox" value="remember-me"> Remember me
                         </label>
                        </div>
                    <div class="form-group row">
                        <div class="col-md-6">
                             <button class="btn btn-lg btn-outline-info btn-block  float-right" style="display:grid;grid-template-columns:1fr 1fr 1fr;grid-template-rows:50px;" type="submit" id="btn-submit">Sign in</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>

<%@include file= "/layouts/footer.html" %>
