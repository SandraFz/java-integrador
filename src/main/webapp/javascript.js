//Delete departamento
function setDepartamentoId(numero) {
				document.getElementById('depto').value=numero;
			}
			
//Alertas sobre funciones incompletas o con fallas en navbar.jsp

let enProceso = document.getElementById("alert");
let enProceso1 = document.getElementById("alert1");
let conError = document.getElementById("search");

function alerta(){
	
		alert("Lo siento, esta función está en proceso.")
}

function alertaError(){
	
		alert("Aquí el código me generó un error que no puede resolver. A pesar de ser el mismo que el del AllFindController, me pide que inicialice una variable, la cual lo hago dentro del try pero no lo reconoce. Todavía no pude entender por qué.")
}

enProceso.addEventListener("click", alerta);
enProceso1.addEventListener("click", alerta);
conError.addEventListener("click", alertaError);
//conError.removeEventListener("click", alertaError);





//Validación de campos en formularios editar y crear.

/*let inputs = document.querySelectorAll(".form-control");
let i;
let areInvalid = 0;
    
    for (i = 0; i < inputs.length; i++){
        
        if (inputs[i].value == "") {
            
            inputs[i].classList.add("is-invalid");
            areInvalid +=1
        }
    }

    if(areInvalid > 0){
        alert("Complete todos los campos")
    }*/

    /*if(typeof parseInt(cantidad) !== Number){
            alert("La cantidad debe ser un número")
            inputs[i].classList.add("is-invalid"); 
        return  
    }*/
    
    