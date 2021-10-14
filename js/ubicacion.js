const url = "http://localhost:8080/api/ubicacion";
const contenedor = document.querySelector('tbody')
let resultados = ''

const formProducto = document.getElementById('mainForm')
const idubicacion = document.getElementById('idubicacion')
const idproducto = document.getElementById('idproducto')
const capacidad = document.getElementById('capacidad')
const cantidad = document.getElementById('cantidad')
const idzona = document.getElementById('idzona')
const ubicalinea = document.getElementById('ubicalinea')
const ubicanivel = document.getElementById('ubicanivel')
const ubicacelda = document.getElementById('ubicacelda')
const RowInsert = document.getElementById('row01')

let opcion = ''

btnCrear.addEventListener('click', () => {
    RowInsert.style.visibility = 'visible'
    RowInsert.style.display = 'block'
    idubicacion.value = ''
    idproducto.value = ''
    capacidad.value = ''
    cantidad.value = ''
    idzona.value = ''
    ubicanivel.value = ''
    ubicalinea.value = ''
    ubicacelda.value = ''    
    //modalClientes.show()
    opcion = 'crear'
})


const ajax = (options) => {
    let { url, method, success, error, data } = options;    
    const xhr = new XMLHttpRequest();

    xhr.addEventListener("readystatechange", (e) => {
        if (xhr.readyState !== 4) return;

        if (xhr.status >= 200 && xhr.status < 300) {
            let json = JSON.parse(xhr.responseText);
            success(json);
        } else {
            let message = xhr.statusText || "Ocurrió un error";
            error(`Error ${xhr.status}: ${message}`);
        }
    });

    xhr.open(method || "GET", url);
    xhr.setRequestHeader("Content-type", "application/json; charset=utf-8");
    xhr.send(JSON.stringify(data)); 
   
};



const getAll = () => {
    $.ajax({
        url: url,
        crossDomain: true,        
        success: (res) => {
            console.log(res);

            res.forEach((ubicacion) => {
                resultados += `<tr>
                        <td>${ubicacion.idubicacion}</td>
                        <td>${ubicacion.idproducto}</td>
                        <td>${ubicacion.capacidad}</td>
                        <td>${ubicacion.cantidad}</td>
                        <td>${ubicacion.idzona}</td>
                        <td>${ubicacion.ubicalinea}</td>
                        <td>${ubicacion.ubicanivel}</td>
                        <td>${ubicacion.ubicacelda}</td>
                        
                        <td><button type="button" onclick="clickEvent" class="btnEditar btn btn-rounded btn-warning">Upd</button> <button type="button" onclick="clickEvent" class="btnBorrar btn btn-rounded btn-danger">Del</button>
                    </tr>`
            });

            contenedor.innerHTML = resultados
        },
        error: (err) => {
            console.log(err);
           //$table.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`);
        },
    });
};

document.addEventListener("DOMContentLoaded", getAll);

document.addEventListener("click", (e) => {

    if (e.target.matches(".btnBorrar")) {
        const fila = e.target.parentNode.parentNode
        const id = fila.firstElementChild.innerHTML
        console.log(id)
        alertify.confirm(`¿Estás seguro de eliminar el id ${id}?`,
            function () {
                ajax({
                    url: url + "/" + id,
                    method: "DELETE",
                    headers: {
                        'Content-Type': 'application/json',
                        "Access-Control-Allow-Headers" : "Content-Type",
                        "Access-Control-Allow-Origin": "*",
                        "Access-Control-Allow-Methods": "OPTIONS,POST,GET"
                    },
                    success: (res) => location.reload(),
                    error: (err) => alert(err),
                });
                alertify.success('Registro eliminado')
            },
            function () {
                alertify.error('Cancel')
            });


            
    }
    if (e.target.matches(".btnEditar")) {
        const fila = e.target.parentNode.parentNode
        idubicacion.value = fila.children[0].innerHTML
        idproducto.value = fila.children[1].innerHTML
        capacidad.value = fila.children[2].innerHTML
        cantidad.value = fila.children[3].innerHTML
        idzona.value = fila.children[4].innerHTML
        ubicalinea.value = fila.children[5].innerHTML
        ubicanivel.value = fila.children[6].innerHTML
        ubicacelda.value = fila.children[7].innerHTML 
        opcion = 'editar'
        RowInsert.style.visibility = 'visible'
        RowInsert.style.display = 'block'
    }
})


formProducto.addEventListener('submit', (e) => {
    e.preventDefault()
    let metodo = "POST"
    if (opcion == 'editar') {
        metodo = "PUT"

    }
  
    var idubicacionv = idubicacion.value
    var idproductov = idproducto.value
    var capacidadv = capacidad.value
    var cantidadv = cantidad.value
    var idzonav = idzona.value
    var ubicalineav = ubicalinea.value
    var ubicanivelv = ubicanivel.value
    var ubicaceldav = ubicacelda.value
    
    var sendInfo = {
        idubicacion: idubicacionv,
        idproducto: idproductov,
        capacidad: capacidadv,
        cantidad: cantidadv,
        idzona: idzonav,
        ubicalinea: ubicalineav,
        ubicanivel: ubicanivelv,
        ubicacelda: ubicaceldav

        }

    ajax({
        type: "PUT",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        url: url,
        contentType: "application/json; charset=utf-8",        
        dataType: "json",
        success: function (msg) {
            if (msg) {
                alert("Cambio efectuado exitosamente !");
                location.reload(true);
            } else {
                alert("No se puede realizar el cambio !");
            }
        },
        error: function(errMsg) {
            alert(errMsg);
        },
        data: JSON.stringify(sendInfo)
    });

   ajax({
        url: url,
        method: metodo,
        headers: {
            'Content-Type': 'application/json'
        },
        success: (res) => location.reload(),
        error: (err) =>
            $form.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`),
        data: {
            "idubicacion": idubicacion.value,
            "idproducto": idproducto.value,
            "capacidad": capacidad.value,
            "cantidad": cantidad.value,
            "idzona": idzona.value,
            "ubicalinea": ubicalinea.value,
            "ubicanivel": ubicanivel.value,
            "ubicacelda": ubicacelda.value

        },
    });
    
    RowInsert.style.visibility = 'hidden'
    RowInsert.style.display = 'none'

})
