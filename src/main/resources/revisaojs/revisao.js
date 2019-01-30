		function exibeNome(){
			var eleNome = document.getElementById('txtNome');
			var srtNome = eleNome.value;
			var elDisplay = document.getElementById("display");
			elDisplay.innerText = srtNome;
			
		}
		
		function novoContacto(){
		//console.log(srtNome);
			var elListaContactos = document.getElementById("listaContactos");
			var inputContacto = document.createElement("input");
			inputContacto.setAttribute('name','txtContacto');
			var labelContacto = document.createElement("label");
			var br = document.createElement("br");
			var btnEcluir = document.createElement("input");
			btnEcluir.setAttribute("type","button");
			btnEcluir.setAttribute("value", "-");
			btnEcluir.onclick = function (){
			elListaContactos.removeChild(divLinha);	
			};
			var divLinha = document.createElement("div");

			labelContacto.innerText = "Contacto:";
			
			divLinha.appendChild(labelContacto);
			divLinha.appendChild(inputContacto);
			divLinha.appendChild(btnEcluir);
			divLinha.appendChild(br);
			elListaContactos.appendChild(divLinha);
		
		}
		
		function imprimirDados(){
			var arrInputsContactos = document.frmContactos.txtContacto;
			var saidaContacto = document.getElementById("saidaContactos");
			var saida="";
			for (i=0;i<arrInputsContactos.length; i++){
				saida +=arrInputsContactos[i].value+"<br>";
			}
			saidaContacto.innerHTML = saida;
			
			
		}
