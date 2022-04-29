const expresiones = {
	usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}

const formulario = document.querySelector('form');
//console.log(formulario);

const inputs = document.querySelectorAll("input");
//console.log(inputs);

const nombreError = document.querySelector('#errorNombre'); //esto es para seleccionar un etiqueta con un id dentro de la etiqueta p
const apellidoError = document.querySelector('#errorApellido');
const emailError = document.querySelector('#errorEmail');
const passworError = document.querySelector('#errorPassword');
const telefonoError = document.querySelector('#errorTelefono');

//retornar si los datos estan correctos
const estatusInf = {
	nombre: false,
	apellido: false,
	email: false,
	password:false,
	telefono:false
}

inputs.forEach((inp)=>{
	//console.log(inp);
	inp.addEventListener("keyup",(e)=>{
		//console.log(e.target.name);

		switch (e.target.name){
			case "nombre":
				//console.log(e.target.value);
				//utilizar espresiones regulares en javaScript
				if(expresiones.nombre.test(e.target.value)){
					estatusInf.nombre = true
					//console.log("Nombre correcto");
					nombreError.textContent = ""
				}
				else{
					estatusInf.nombre = false
					//console.log("Nombre incorrecto");
					nombreError.textContent = "Nombre no valido"
				}
				break

			case "apellido":
				if(expresiones.nombre.test(e.target.value)){
					estatusInf.apellido = true
					//console.log("Apellido correcto");
					apellidoError.textContent = ""
				}
				else{
					estatusInf.apellido = false
					//console.log("Apellido incorrecto");
					apellidoError.textContent = "Apellido no valido"
				}
				break
			case "email":
				if(expresiones.email.test(e.target.value)){
					estatusInf.email = true
					//console.log("Email correcto");
					emailError.textContent = ""
				}
				else{
					estatusInf.email = false
					//console.log("Email incorrecto");
					emailError.textContent = "Email incorrecto"
				}
				break
			case "password":
				if(expresiones.password.test(e.target.value)){
					estatusInf.password = true
					//console.log("Password correcto");
					passworError.textContent = ""
				}
				else{
					estatusInf.password = false
					//console.log("Password incorrecto");
					passworError.textContent = "Password invalido"
				}
				break
			case "telefono":
				if(expresiones.telefono.test(e.target.value)){
					estatusInf.telefono = true
					//console.log("Teléfono correcto");
					telefonoError.textContent = ""
				}
				else{
					estatusInf.telefono = false
					//console.log("Teléfono incorrecto");
					telefonoError.textContent = "Teléfono invalido"
				}
				break

		}
			
	})
})
//para identificar que elemento es es que esta escribiendo
formulario.addEventListener("submit", (e) =>{
	e.preventDefault();

	/* console.log(Object.values(estatusInf));
	console.log(Object.values(estatusInf).includes(false)) */
	const check = document.querySelector("#terminos").checked

	if(!Object.values(estatusInf).includes(false) && check == true){
		/* console.log("Enviado");	 */
		document.querySelector(".alert-danger").style.display = "none"
		const datos = Object.fromEntries(
			new FormData(e.target)
		)
		console.log(datos)
		formulario.reset()

	}
	else{
		/* console.log("No enviado"); */
		document.querySelector(".alert-danger").style.display = "block"
	}

	

	//realizar una validacion de los elementos que estan dentro del formulario.
	//input tiene un atributo para poner expresiones regulares pattern= poner la expresion regular


})


