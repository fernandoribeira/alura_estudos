let frutas = [];
let laticinios = [];
let congelados = [];
let doces = [];
let continua = true;
while (continua) {
    opcao = prompt('você deseja adicionar uma comida na sua lista de compras?\nDigite Sim ou Não');
    if (opcao == 'Sim') {
        let comida = prompt('Qual comida você deseja inserir?');
        let categoria = prompt('Em qual categoria você deseja inserir?\nFrutas\nLaticinios\nCongelados\nDoces');
        switch (categoria) {
            case 'Frutas':
                frutas.push(comida);
                break;
            case 'Laticinios':
                laticinios.push(comida);
                break;
            case 'Congelados':
                congelados.push(comida);
                break;
            case 'Doces':
                doces.push(comida);
                break;
            default:
                alert('Categaoria inexistente!\nInsira a comida novamente.');
        }  
    } else if (opcao == 'Não') {
        console.log('Lista de compras:');
        console.log('Frutas:');
        for (let i = 0; i < frutas.length; i++) {
            console.log(frutas[i]);
        }
        console.log('Laticinios:');
        for (let i = 0; i < laticinios.length; i++) {
            console.log(laticinios[i]);
        }
        console.log('Congelados:');
        for (let i = 0; i < congelados.length; i++) {
            console.log(congelados[i]);
        }
        console.log('Doces:');
        for (let i = 0; i < doces.length; i++) {
            console.log(doces[i]);
        }
        continua = false;
        break;
    } else {
        alert('Resposta incorreta!');
    }
}
alert('Programa encerrado!');
