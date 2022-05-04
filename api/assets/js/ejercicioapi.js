const url = "https://jsonplaceholder.typicode.com/albums/1/photos"

const $lista = document.querySelector('.row');

fetch(url).then(resp => resp.json()).then(datos =>{

    datos.forEach(cuadros =>{

        console.log(cuadros.url);

        const template = `<div class="col mb-4">
        <div class=style="width: 18rem;">
          <img src="${cuadros.thumbnailUrl}" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">${cuadros.title}</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>`
        $lista.innerHTML += template
    } )
   
   
    
});









