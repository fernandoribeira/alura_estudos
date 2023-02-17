const nome = prompt("Qual o seu nome?");
const idade = prompt("Quantos anos você tem?");
const linguagem = prompt("Qual linguagem de programação você está estudando?");

let mensagem1 = `Olá ${nome}, você tem ${idade} anos e já está aprendendo ${linguagem}!`;
const paragrafo1 = document.createElement("p");
paragrafo1.innerText = mensagem1;
document.body.appendChild(paragrafo1);

const estudar = prompt(`Você gosta de estudar ${linguagem}?`);

let mensagem2;

if (estudar == 1) {
    mensagem2 = "Muito bom! Continue estudando e você terá muito sucesso.";
} else if ( estudar == 2) {
    mensagem2 = "Ahh que pena... Já tentou aprender outras linguagens?";
}

const paragrafo2 = document.createElement("p");
paragrafo2.innerText = mensagem2;
document.body.appendChild(paragrafo2);
