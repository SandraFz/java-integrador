<%@page import="ar.com.javaintegrador.domain.Departamento"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"/>

<body>
	<jsp:include page="navbar.jsp"/>
	<main>
        <h2>Departamentos</h2>
        
        <%List<Departamento> deptos = (List<Departamento>)request.getAttribute("deptos"); %>
        
        <table class="table">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">Nombre</th>
                <th scope="col">Presupuesto</th>
              </tr>
            </thead>
            <tbody>
            <% for (Departamento depto : deptos) { %>
              <tr>
     
                <th scope="row"><%= depto.getNumero() %></th>
                <td><%= depto.getNombre() %></td>
                <td><%= depto.getPresupuesto() %></td>
                <td>
                    <a class="btn btn-success" 
						role="button" 
						href="<%=request.getContextPath()%>/updateDepto?number=<%=depto.getNumero() %>"
						target="_blank">
						Editar
					</a>
					<!-- <a class="btn btn-danger"
						role="button"
						href="<%=request.getContextPath() %>/deleteDpto?number=<%=depto.getNumero() %>"
						>
						Eliminar
					</a> -->
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#eliminar" onclick="setDepartamentoId(<%=depto.getNumero()%>)">Eliminar</button>
                </td>
              </tr>
              <% } %>
            </tbody>
          </table>
          
          <!-- modal -->
          
          <div class="modal" tabindex="-1" id="eliminar">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <form action="<%=request.getContextPath()%>/deleteDepto" method="GET">
                
                <div class="modal-body">
                  <p>Está seguro que desea eliminar este departamento?</p>
                </div>
                <input type="hidden" name="deptoToDelete" id="depto">
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                  <button type="submit" class="btn btn-danger">Eliminar</button>
                </div>
                
                </form>
              </div>
            </div>
          </div>
    </main>
    <script src="bootstrap.js"></script>
     <script>
			function setDepartamentoId(numero) {
				document.getElementById('depto').value=numero;
			}
	  </script>
</body>
</html>