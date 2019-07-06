<%-- 
    Document   : list
    Created on : Jan 30, 2019, 11:28:37 AM
    Author     : MaySM
--%>

<%@include file= "/layouts/header.jsp" %>

<main style="margin-top:7%;margin-bottom:7%;">
    <div class="container">
        <h4 style="background-color: yellow;">
            <c:out value='${message}' />
        </h4>
        <div class="row">
            <a href="produks?action=new" class="btn btn-primary">
                <i class="fa fa-plus"></i>Tambah
            </a>
        </div>
        <br>
        <table class="table table-bordered table-striped table-hover">
            <thead>
              <tr>
                <th scope="col">No</th>
                <th scope="col">Kode</th>
                <th scope="col">Nama</th>
                <th scope="col">Harga</th>
                <th scope="col">Stok</th>
                <th scope="col">Opsi</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="barang" items="${produks}">
                  <tr>
                    <td scope="row">${barang.id}</td>
                    <td>${barang.kode}</td>
                    <td>${barang.nama}</td>
                    <td>${barang.harga}</td>
                    <td>${barang.stok}</td>
                    <td>
                     <a href="produks?action=edit&id=<c:out value="${barang.getId()}"/>" class="btn btn-outline-info btn-sm">Edit</a>
                     <a onclick="return confirm('Are you sure ?')" href="produks?action=delete&id=<c:out value="${barang.getId()}"/>" class="btn btn-outline-danger btn-sm">Delete</a>
                    </td>
                  </tr>
              </c:forEach>
            </tbody>
          </table>
    </div>
</main>

<%@include file= "/layouts/footer.html" %>
