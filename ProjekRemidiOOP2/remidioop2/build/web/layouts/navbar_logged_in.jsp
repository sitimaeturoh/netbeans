<%-- 
    Document   : navbar_logged_in.jsp
    Created on : Jan 31, 2019, 7:35:36 PM
    Author     : MaySM
--%>

<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
  <a class="navbar-brand" href="#">ProjectOOP2</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="produks?action=list">Produk</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="users?action=profile">Profil</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="users?action=logout">Log Out</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" method="POST" action="produks?action=list">
      <input class="form-control mr-sm-2" name="produks" type="text" placeholder="Search..." aria-label="Search...">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<h1><% out.println("Anda Login Dengan User: " + session.getAttribute("current_user")); %></h1>