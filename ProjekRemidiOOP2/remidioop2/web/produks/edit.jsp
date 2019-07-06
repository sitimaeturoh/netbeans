<%-- 
    Document   : edit
    Created on : Jan 31, 2019, 11:09:56 AM
    Author     : MaySM
--%>

<%@include file= "/layouts/header.jsp" %>

<main>
    <div class="jumbotron">
    <div class="container">
        <h4><c:out value='${message}' /></h4>
        <div class="row">
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-header">Form Edit Produk</div>
                    <div class="card-body">
                        <form method="post" 
                              action="/remidioop2/produks?action=update&id=<c:out value='${barang.getId()}' />">
                        <div class="form-group row">
                          <label for="kode" class="col-sm-2 col-form-label">
                              Kode
                          </label>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="kode" 
                                   name="kode" placeholder="Kode Produk" required
                                   value="<c:out value='${barang.getKode()}' />">
                          </div>
                        </div>
                        <div class="form-group row">
                          <label for="nama" class="col-sm-2 col-form-label">
                              Nama
                          </label>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="nama" 
                                   name="nama" placeholder="Nama Produk" required
                                   value="<c:out value='${barang.getNama()}' />">
                          </div>
                        </div>
                        <div class="form-group row">
                          <label for="harga" class="col-sm-2 col-form-label">
                              Harga
                          </label>
                          <div class="col-sm-10">
                            <input type="number" class="form-control" id="harga" 
                                   name="harga" placeholder="Harga Produk" required
                                   value="<c:out value='${barang.getHarga()}' />">
                          </div>
                        </div>
                        <div class="form-group row">
                          <label for="stok" class="col-sm-2 col-form-label">
                              Stok
                          </label>
                          <div class="col-sm-10">
                            <input type="number" class="form-control" id="stok" 
                                   name="stok" placeholder="Stok Produk" required
                                   value="<c:out value='${barang.getStok()}' />">
                          </div>
                        </div>
                        <div class="form-group row">
                          <div class="col-sm-10 offset-sm-2">
                            <input type="submit" value="Submit" class="btn btn-outline-success" />
                            <input type="button" value="Back" onclick="goBack()" class="btn btn-outline-danger" />
                          </div>
                        </div>
                          <div>
                          </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
                                
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script>
            function goBack() {
                window.history.back();
            }
        </script>

<%@include file= "/layouts/footer.html" %>