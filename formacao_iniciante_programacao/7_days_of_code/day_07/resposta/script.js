// Variaveis
let continua = true;
let operacao;
let valor1;
let valor2;
let resultado;

// Funções
function menu() {
    operacao = prompt(
        "CALCULADORA\n" +
        "Escolha o número da operação desejada\n" +
        "1 - Soma\n" +
        "2 - Subtração\n" +
        "3 - Multiplicação\n" +
        "4 - Divisão\n" +
        "5 - Sair"
    );
}

function entrada() {
    valor1 = parseFloat(prompt("Insira o primeiro valor:"));
    valor2 = parseFloat(prompt("Insira o segundo valor:"));
}

function soma() {
    return valor1 + valor2;
}

function subtracao() {
    return valor1 - valor2;
}

function multiplicacao() {
    return valor1 * valor2;
}

function divisao() {
    return valor1 / valor2;
}

function exibeResultado() {
    alert("O resultado da operação é " + resultado);
}

function sair() {
    alert("Encerrando programa.");
    continua = false;
}

// Programa principal
do {
    menu();
    switch (operacao) {
        case "1":
            entrada();
            resultado = soma();
            exibeResultado();
            break;
        case "2":
            entrada();
            resultado = subtracao();
            exibeResultado();
            break;
        case "3":
            entrada();
            resultado = multiplicacao();
            exibeResultado();
            break;
        case "4":
            entrada();
            resultado = divisao();
            exibeResultado();
            break;
        case "5":
            sair();
    }
} while (continua);
