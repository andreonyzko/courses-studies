// JSON
let afazeres = [
    {
        id: 1,
        tarefa: 'Estudar cursos de programação',
        status: 'doing'
    },

    {
        id: 2,
        tarefa: 'Treinar',
        status: 'to-do'
    },
    {
        id: 3,
        tarefa: 'Ir para a Faculdade',
        status: 'to-do'
    }
]

let listaEmJSON = JSON.stringify(afazeres); // Lista -> JSON
console.log(listaEmJSON);

let JSONemLista = JSON.parse(listaEmJSON); // JSON -> Lista
console.log(JSONemLista)