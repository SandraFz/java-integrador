<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">CRUD</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <li><a class="nav-link" href="<%=request.getContextPath()%>/index.jsp">Inicio</a></li>
        </li>
        <li class="nav-item">
           <a class="nav-link" href="<%=request.getContextPath()%>/FindAllDepartamentoController">Listado</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/nuevo.jsp">Nuevo Producto</a>
        </li>
       
      </ul>
    </div>
  </div>
</nav>