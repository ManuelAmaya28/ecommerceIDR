window.addEventListener("load", function (event) {
    addItems();
});

const URL_MAIN ='http://127.0.0.1:8080/productos/';
function addItems() {

   

    fetch(URL_MAIN, { method: 'get' }).then(function(response) {
          response.json().then(function (json) {
             console.log(json);
             console.log(json.length);
            Array.from(json).forEach( (item) => {
                addItem(item);
             }); // foreach
         });//then
     }).catch(function(err) {
         console.log(err);
     });
     console.log(document.getElementById("div_Productos"));
   
}// addItems


function addItem(item) {
    const itemHTML = `
    <div class = "cajitas container">
    <div class="card h-100">
        <img src="${item.imagen}" class="card-img-top" alt="imagen">
        <div class="card-body">
            <h5 class="card-title">${item.nombre}</h5>
                <p class="card-text text-justify">${item.descripcion}</p>
                <p class="card-text text-justify">Stock: ${item.stock}</p>
                <div style="display: flex; align-items: center; justify-content: space-around;">
                <a href="#" class="btn btn-primary" id="botonAgregarCarrito">Agregar<br> al carrito</a>
                <h5 class="card-title" style = "padding-left: 15px; padding-top: 8px;">$${item.precio}</h5>
                </div>
        </div>
    </div>
    </div>`;
    const productosDiv = document.getElementById("productosDiv");
    productosDiv.innerHTML += itemHTML;
}
