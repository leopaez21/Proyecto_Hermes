const url = "http://localhost:8080/api/remisiones";
const contenedor = document.querySelector('tbody')
let resultados = ''


/*const modalClientes = new bootstrap.Modal(document.getElementById('modalCliente'))*/
//const formRemision = document.querySelector('form')
const formRemision = document.getElementById('mainForm')
const idremision = document.getElementById('idremision')
const idtercero = document.getElementById('idtercero')
const fecha = document.getElementById('fecha')
const idProducto = document.getElementById('idproducto')
const cantidad = document.getElementById('cantidad')
const idubicacion = document.getElementById('idubicacion')
const entrada_salida = document.getElementById('entrada_salida')
const despachado = document.getElementById('despachado')
const RowInsert = document.getElementById('row01')

let opcion = ''

btnCrear.addEventListener('click', () => {
    RowInsert.style.visibility = 'visible'
    RowInsert.style.display = 'block'
    idremision.value = ''
    idtercero.value = ''
    fecha.value = ''
    idProducto.value = ''
    cantidad.value = ''
    idubicacion.value = ''
    entrada_salida.value = ''
    despachado.value = ''    
    //modalClientes.show()
    opcion = 'crear'
})



/*const ajax = (options) => {
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
    var dataJason = JSON.stringify(data)
    xhr.send(data);
};*/



const getAll = () => {
    $.ajax({
        url: url,
        crossDomain: true,        
        success: (res) => {
            console.log(res);

            res.forEach((remision) => {
                resultados += `<tr>
                        <td>${remision.idremision}</td>
                        <td>${remision.tercero.idtercero}</td>
                        <td>${remision.tercero.nombretercero}</td>
                        <td>${remision.fecha}</td>
                        <td>${remision.idproducto}</td>
                        <td>${remision.cantidad}</td>
                        <td>${remision.idubicacion}</td>
                        <td>${remision.entrada_salida}</td>
                        <td>${remision.despachado}</td>  
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
    $.ajax({
        url: "http://localhost:8080/api/ubicacion",
        crossDomain: true,        
        success: (res) => {
            console.log(res);
            while (idubicacion.options.length > 0) {
                idubicacion.remove(0);
            }
            res.forEach((ubicacion) => {
                var opt = document.createElement('option');
                opt.value = ubicacion.idubicacion;
                opt.innerHTML = ubicacion.idubicacion;
                idubicacion.appendChild(opt);
            });
        },
        error: function(errMsg) {
            alert(errMsg);
        },
    }); 
    /*inicio*/
    $.ajax({
        url: "http://localhost:8080/api/productos",
        crossDomain: true,        
        success: (res) => {
            console.log(res);
            while (idproducto.options.length > 0) {
                idproducto.remove(0);
            }
            res.forEach((producto) => {
                var opt = document.createElement('option');
                opt.value = producto.idproducto;
                opt.innerHTML = producto.nombre;
                idproducto.appendChild(opt);
            });
        },
        error: function(errMsg) {
            alert(errMsg);
        },
    });/*fin*/
    $.ajax({
        url: "http://localhost:8080/api/terceros",
        crossDomain: true,        
        success: (res) => {
            console.log(res);
            while (idtercero.options.length > 0) {
                idtercero.remove(0);
            }
            res.forEach((tercero) => {
                var opt = document.createElement('option');
                opt.value = tercero.idtercero;
                opt.innerHTML = tercero.nombretercero;
                idtercero.appendChild(opt);
            });
        },
        error: function(errMsg) {
            alert(errMsg);
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

/* ??   idremision - idtercero - fecha - idproducto - cantidad - idubicacion - entrada_salida - despachado   */

    }
    if (e.target.matches(".btnEditar")) {
        const fila = e.target.parentNode.parentNode
        idremision.value = fila.children[0].innerHTML
        idtercero.value = fila.children[1].innerHTML
        fecha.value = fila.children[2].innerHTML
        idproducto.value = fila.children[3].innerHTML
        cantidad.value = fila.children[4].innerHTML
        idubicacion.value = fila.children[5].innerHTML
        entrada_salida.value = fila.children[6].innerHTML
        despachado.value = fila.children[7].innerHTML 
        opcion = 'editar'
        RowInsert.style.visibility = 'visible'
        RowInsert.style.display = 'block'
    }
})


formRemision.addEventListener('submit', (e) => {
    e.preventDefault()
    let metodo = "POST"
    if (opcion == 'editar') {
        metodo = "PUT"

    }
    /*let url2 = "insertar"
    if (opcion == 'editar') {
        url2 = "modificar"
    }*/
    
     /* ok*/ 
    var idremisionV = idremision.value
    var idterceroV = idtercero.value
    var fechaV = fecha.value
    var idproductoV = idproducto.value
    var cantidadV = cantidad.value
    var idubicacionV = idubicacion.value
    var entrada_salidaV = entrada_salida.checked
    var despachadoV = despachado.checked
  
/* ??   idremision - idtercero - fecha - idproducto - cantidad - idubicacion - entrada_salida - despachado   */

    var sendInfo = {
        idremision:idremisionV,
        tercero:{
            idtercero:idterceroV,
            nombretercero:"",
            tipodocumento:{
                iddocumento:"0",
                descripcion:"",
                nombrecorto:""},
            identificacion:"",
            telefono:"",
            email:"",
            ciudad:{
                idciudad:"0",
                nombreciudad:"",
                departamentos:{
                    codigodep:"0",
                    nombredep:""}},
            direccion:""},
        fecha:fechaV,
        idproducto:idproductoV,
        cantidad:cantidadV,
        idubicacion:idubicacionV,
        entrada_salida:entrada_salidaV,
        despachado:despachadoV}

        $.ajax({
        type: metodo,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        url: url,
        contentType: "application/json; charset=utf-8",        
        dataType: "json",
        success: function (msg) {
            if (msg) {
                alert("Somebody  was added in list !");
                location.reload(true);
            } else {
                alert("Cannot add to list !");
            }
        },
        error: function(errMsg) {
            alert(errMsg);
        },
        data: JSON.stringify(sendInfo)
    });

   /*  ajax({
        url: url + url2 ,
        method: metodo,
        headers: {
            'Content-Type': 'application/json'
        },
        success: (res) => location.reload(),
        error: (err) =>
            $form.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`),
        data: sendInfo
    }); */
    RowInsert.style.visibility = 'hidden'
    RowInsert.style.display = 'none'
})
