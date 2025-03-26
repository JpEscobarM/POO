const formulario = document.querySelector(".formulario");

let inputNome = document.querySelector(".nome");
let  inputEmail = document.querySelector(".email");
let inputUsername = document.querySelector(".username");
let  inputSenha = document.querySelector(".senha");
let  inputTelefone = document.querySelector(".telefone");



function cadastrar(dados)
{
    fetch("http://localhost:8080/usuarios", //ENDPOINT ( ENDEREÇO DE ACESSO PARA A API)
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method:"POST",
            body:JSON.stringify({
        nome: inputNome.value,
        username: inputUsername.value,
        email:inputEmail.value,
        senha:inputSenha.value,
        telefone:inputTelefone.value

            })
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})

};

function limpar(){
    inputNome.value = "",
    inputEmail.value = "",
    inputSenha.value= "",
    inputTelefone.value= ""
    
}

//SEGURA PRA NAO ATUALIZAR A PAGINA AO ATUALIZAR FORMULARIO
function eventoFormulario(event)
{   
    event.preventDefault();

    

    

    cadastrar();
    
    
    limpar();

}



formulario.addEventListener("submit", eventoFormulario);
////
