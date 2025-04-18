// Objetos
let aluno = {
    ra: 2653613,
    nome: 'André',
    idade: 20,
    disciplinas: ['POO', 'BD2', 'MS'],
    estudar(){ // Método
        console.log(`${nome} estudou!`);
    }
} // Escopo de um objeto

let { ra, nome, idade, disciplinas: materias } = aluno; // Salva os atributos do objeto em variaveis comuns

console.log(aluno);
console.log(`RA: ${ra}`);
console.log(`Nome: ${nome}`);
console.log(`Idade: ${idade}`);
console.log(`Disciplinas: ${materias}`);
console.log(`Favorita: ${materias[materias.indexOf('POO')]}`); // indexOf procura o valor no vetor e retorna sua posição

aluno.favorita = {
    sigla: materias[materias.indexOf('POO')],
    materia: "Programação Orientada a Objetos"
}; // Adiciona um novo atributo ao objeto
let { favorita: { materia: materia_favorita } } = aluno;
console.log(materia_favorita);

aluno.estudar();


console.log("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n ")

// Objetos dentro de lista
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

for (index in afazeres) {
    console.log(`${afazeres[index].tarefa}: ${afazeres[index].status}`)
}

let dono = {
    nome: "André",
    idade: 20,
    discord: "andreonyz#0018"
}
console.log(dono);

// Pegar o nome dos atributos de um obj
console.log(Object.keys(dono));

// Pegar o valor dos atributos de um obj
console.log(Object.values(dono));

// Retorna nome dos atributos e valores dentro de vetores
console.log(Object.entries(dono));

