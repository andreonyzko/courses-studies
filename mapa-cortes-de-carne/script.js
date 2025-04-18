const modal = document.querySelector("#modal");
const titleArea = document.querySelector("#title-area");
const closebtn = document.querySelector('#close-modal');
console.log(closebtn)

const area = document.querySelectorAll('area').forEach(area =>{
    area.addEventListener('click', (e)=> {
        e.preventDefault();

        let title = area.getAttribute('title');
        modal.style.display = 'block';
        titleArea.textContent = title.toUpperCase();

        console.log(title);
    })
})

closebtn.addEventListener('click', () => {
    modal.style.display = 'none';
})