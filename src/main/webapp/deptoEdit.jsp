<%@page import="ar.com.javaintegrador.domain.Departamento" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"/>

<body>

<jsp:include page="navbar.jsp"/>

        <main>
        
        <form action="<%=request.getContextPath()%>/updateDepto" method="POST">
        
        <div class="w-75 formNewDpto">
            <h2>Editar departamento</h2>
            
            <%Departamento depto = (Departamento)request.getAttribute("depto"); %>

            <div class="d-flex mt-3 inputsEdit">
                <div class="w-25 ms-1 me-1">
                    <label for="numero">Número</label>
                    <input class="form-control" type="text" value="<%= depto.getNumero() %>"
                        aria-label="readonly input example" name="numero">
                </div>

                <div class="w-50 ms-1 me-1">
                    <label for="numero">Nombre</label>
                    <input class="form-control" type="text" value="<%= depto.getNombre() %>"
                        aria-label="readonly input example" name="nombre">
                </div>

                <div class="w-50 ms-1 me-1">
                    <label for="numero">Presupuesto</label>
                    <input class="form-control" type="text" value="<%= depto.getPresupuesto() %>"
                        aria-label="readonly input example" name="presupuesto">
                </div>
            </div>
            <div class="mt-3 d-flex setButtons">
                <button class="btn btn-success" type="submit">Guardar</button>
            </div>
            
        </div>
        
        </form>
        
        </main>

<script src="bootstrap.js"></script>
    
</body>
</html>