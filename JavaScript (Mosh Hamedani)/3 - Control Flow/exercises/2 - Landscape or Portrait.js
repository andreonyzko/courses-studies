function viewport(width, height){
    return width > height ? "Landscape" : "Portrait";
}

console.log(viewport(1000,500));