let numeroASerAdivinhado = Math.round(Math.random() * (10 - 1) + 1);
let tentativas = 1;
let ganhou = false;

while (tentativas <= 3) {
    let chute = prompt('Qual o valor que você deseja chutar?');
    if (numeroASerAdivinhado == chute) {
        ganhou = true;
        break;
    } else {
        alert(`Número incorreto!\nEsta foi a tentativa ${tentativas} de 3`);
        tentativas++;
    }
}

if (ganhou) {
    alert(`Parabéns você acertou!!!\nO número a ser adivinhado era o número ${numeroASerAdivinhado}`);
} else {
    alert(`Que pena, você não acertou...\nO número a ser adivinhado era o número ${numeroASerAdivinhado}`);
}
