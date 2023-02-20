let respostaFrontBack = '0';
while (!(respostaFrontBack == '1' || respostaFrontBack == '2')) {
    respostaFrontBack = prompt('Você quer seguir para área de Front-End ou seguir para a área de Back-End?\nDigite 1 para seguir em Front-End ou 2 para seguir em Back-End.');
    if (!(respostaFrontBack == '1' || respostaFrontBack == '2')) {
        alert('Resposta incorreta!');
    }
}

let repostaReactVue = '0';
let repostaCSharpJava = '0';
if (respostaFrontBack == '1') {
    while (!(repostaReactVue == '1' || repostaReactVue == '2')) {
        repostaReactVue = prompt('Você quer aprender React ou aprender Vue?\nDigite 1 para escolher React ou 2 para escolher Vue.');
        if (!(repostaReactVue == '1' || repostaReactVue == '2')) {
            alert('Resposta incorreta!');
        }
    }
} else {
    while (!(repostaCSharpJava == '1' || repostaCSharpJava == '2')) {
        repostaCSharpJava = prompt('Você quer aprender C# ou aprender Java?nDigite 1 para aprender C# ou 2 para aprender Java.');
        if (!(repostaCSharpJava == '1' || repostaCSharpJava == '2')) {
            alert('Resposta incorreta!');
        }
    }
}

let especialistaFullStack = '0';
while (!(especialistaFullStack == '1' || especialistaFullStack == '2')) {
    especialistaFullStack = prompt('Você quer seguir se especializando na área escolhida ou seguir se desenvolvendo para se tornar Fullstack?\nDigite 1 para seguir se especializando ou 2 para se tornar um Fullstack.');
    if (!(especialistaFullStack == '1' || especialistaFullStack == '2')) {
        alert('Resposta incorreta!');
    }
}

let modoDeEscolha = '0';
while (!(modoDeEscolha == '1' || modoDeEscolha == '2')) {
    modoDeEscolha = prompt('Voce deseja definir a quantidade de tecnologias a aprender ou deseja ir digitando quantas quiser?\nDigite 1 para definir a quantidade de tecnologias ou 2 para ir digitando quantas quiser.');
    if (!(modoDeEscolha == '1' || modoDeEscolha == '2')) {
        alert('Resposta incorreta!');
    }
}

let quantidadeTecnologias = 0;
let listaTecnologias = [];
let contador = 1;
if (modoDeEscolha == '1') {
    while ((quantidadeTecnologias <= 0) || isNaN(quantidadeTecnologias)) {
        quantidadeTecnologias = prompt('Quantas tecnologias você deseja aprender?');
        if ((quantidadeTecnologias <= 0) || isNaN(quantidadeTecnologias)) {
            alert('Resposta incorreta!');
        }
    }
    while (contador <= quantidadeTecnologias) {
        let tecnologia = prompt('Insira a tecnoclogia que você deseja aprender...');
        listaTecnologias[contador] = tecnologia;
        contador++;
    }
} else {
    let continua;
    do {
        let tecnologia = prompt('Insira a tecnoclogia que você deseja aprender...');
        listaTecnologias[contador] = tecnologia;
        contador++;
        continua = confirm("Você deseja continuar?");
    } while (continua);
}

// Respostas
console.log('respostaFrontBack = ' + respostaFrontBack);
console.log('repostaReactVue = ' + repostaReactVue);
console.log('repostaCSharpJava = ' + repostaCSharpJava);
console.log('especialistaFullStack = ' + especialistaFullStack);
console.log('modoDeEscolha = ' + modoDeEscolha);
console.log('quantidadeTecnologias = ' + quantidadeTecnologias);
for (let i = 0; i < listaTecnologias.length; i++) {
    console.log(listaTecnologias[i]);
}
