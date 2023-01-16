<%@page import="ar.com.javaintegrador.domain.Departamento"%>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"/>

<body>
<jsp:include page="navbar.jsp"/>

  <main>
  
  <%Departamento depto = (Departamento)request.getAttribute("deptos");%>

        <form action="<%=request.getContextPath()%>/newDepto" method="POST">
        
        <div class="w-75 formNewDpto">
            <h2>Nuevo departamento</h2>

            <div class="d-flex mt-3 inputs">
                <div class="w-25 ms-1 me-1">
                    <label for="numero">Número</label>
                    <input class="form-control" type="text"
                        aria-label="readonly input example" name="numero">
                </div>

                <div class="w-25 ms-1 me-1">
                    <label for="numero">Nombre</label>
                    <input class="form-control" type="text"
                        aria-label="readonly input example" name="nombre">
                </div>

                <div class="w-25 ms-1 me-1">
                    <label for="numero">Presupuesto</label>
                    <input class="form-control" type="text"
                        aria-label="readonly input example" name="presupuesto">
                </div>
            </div>
            <div class="mt-3 d-flex setButtons">
                <button type="submit" class="btn btn-success">Guardar</button>
            </div>
            
        </div>
        
        </form>
        
    </main>
    
</body>
</html>