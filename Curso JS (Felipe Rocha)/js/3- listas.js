// Listas
let adms= ["andré", "kadu", "kaii", "lucas"]
let membros=  ["andrey", "lari"]

// Acesso
console.log(adms[0]);
console.log(`${adms[adms.indexOf("kadu")]} está na ${adms.indexOf("kadu")}ra posição`);
adms[0] = "andreonyz";
console.log(adms);

// Pegar o tamanho do vetor
let tamanho_vetor = adms.length;
console.log(`O servidor tem ${tamanho_vetor} ADMs`)

// ordenado o vetor
adms.sort();
console.log(adms);

// Adiciona mais elementos no final
adms.push("andrey");
console.log(adms);

// Adiciona um elemento no inicio
adms.unshift("andré");
console.log(adms);

// Remove o ultimo elemento
adms.pop();
console.log(adms);

// Remove o primeiro elemento
adms.shift();
console.log(adms);

// Cocatena dois vetores
let participantes = membros.concat(adms);
console.log(participantes);

// Alterar vetor: adicionar, remover e atualizar
participantes.splice(1, 1, "diogo");
console.log(participantes);

// Fatiar vetor
console.log(participantes.slice(2,participantes.length));

// Desempacota o vetor
let [owner, gerente, supervisor, administrador] = adms
console.log(`${owner} > ${gerente} > ${supervisor} > ${administrador}`);

// Tranforma o vetor em uma string, separados pelo caracter informado
console.log(adms.join(" "))