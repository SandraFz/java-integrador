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
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#depto" onclick="setDepartamentoId(<%=depto.getNumero()%>)">Eliminar</button>
                </td>
              </tr>
              <% } %>
            </tbody>
          </table>
          
          <!-- modal -->
          
          <div class="modal fade" id="depto" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    	<form action="<%=request.getContextPath()%>/deleteDepto">
		    	  <input type="hidden" name="idDepto" id="idDepto">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">Eliminar Departamento</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        ¿Confirma que desea eliminar? 
			      </div>
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
				document.getElementById('idDepto').value=numero;
			}
	  </script>
</body>
</html>