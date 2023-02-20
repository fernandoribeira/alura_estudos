// Variaveis

let frutas = [];
let laticinios = [];
let congelados = [];
let doces = [];
let continua = true;

// Funções

function imprimeListaDeCompras() {
    console.clear();
    console.log('Lista de compras:');
    if (frutas.length > 0) {
        console.log(`\tFrutas: ${frutas.join(', ')}`);
    } else {
        console.log('\tFrutas: lista vazia!')
    }
    if (laticinios.length > 0) {
        console.log(`\tLaticinios: ${laticinios.join(', ')}`);
    } else {
        console.log('\tLaticinios: lista vazia!')
    }
    if (congelados.length > 0) {
        console.log(`\tCongelados: ${congelados.join(', ')}`);
    } else {
        console.log('\tCongelados: lista vazia!')
    }
    if (doces.length > 0) {
        console.log(`\tDoces: ${doces.join(', ')}`);
    } else {
        console.log('\tDoces: lista vazia!')
    }
}

function adicionaComidaNaLista() {
    let comida = prompt('Qual comida você deseja inserir?');
    let categoria = prompt('Em qual categoria você deseja inserir?\n1- Frutas\n2 - Laticinios\n3 - Congelados\n4 - Doces');
    switch (categoria) {
        case '1':
            frutas.push(comida);
            break;
        case '2':
            laticinios.push(comida);
            break;
        case '3':
            congelados.push(comida);
            break;
        case '4':
            doces.push(comida);
            break;
        default:
            alert('Categoria inexistente!\nInsira a comida novamente.');
    }
}

function removeComidaDaLista() {
    if (frutas.length == 0 && laticinios.length == 0 && congelados.length == 0 && doces.length == 0) {
        alert('Lista de comidas esta vazia!');
    } else {
        imprimeListaDeCompras();
        let comida = prompt('Qual comida você deseja remover?');
        let removeu = false;
        if (!removeu) {
            for (let i = 0; i < frutas.length; i++) {
                if (comida == frutas[i]) {
                    delete frutas[i];
                    removeu = true;
                    break;
                }
            }
        }
        if (!removeu) {
            for (let i = 0; i < laticinios.length; i++) {
                if (comida == laticinios[i]) {
                    delete laticinios[i];
                    removeu = true;
                    break;
                }
            }
        }
        if (!removeu) {
            for (let i = 0; i < congelados.length; i++) {
                if (comida == congelados[i]) {
                    delete congelados[i];
                    removeu = true;
                    break;
                }
            }
        }
        if (!removeu) {
            for (let i = 0; i < doces.length; i++) {
                if (comida == doces[i]) {
                    delete doces[i];
                    removeu = true;
                    break;
                }
            }
        }
        if (removeu) {
            alert('Comida removida com sucesso!');
        } else {
            alert('Comida não existe na lista!');
        }
        imprimeListaDeCompras();
    }

}

// Programa principal

while (continua) {
    opcao = prompt('Escolha a opção desejada:\n1 - Adicionar comida na lista\n2 - Remover comida da lista\n3 - Mostrar lista\n4 - Encerrar lista');
    if (opcao == '1') {
        adicionaComidaNaLista();
    } else if (opcao == '2') {
        removeComidaDaLista();
    } else if (opcao == '3') {
        imprimeListaDeCompras();
    } else if (opcao == '4') {
        imprimeListaDeCompras();
        continua = false;
        break;
    }else {
        alert('Resposta incorreta!');
    }
}
alert('Programa encerrado!');
