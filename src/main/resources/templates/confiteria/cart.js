
//Mejoras inncesesarias
const productQuantities = {
    mega_combo_diario: 0,
    mega_combo_unico: 0,
    cocacola: 0,
    canchita: 0,
    hotdog: 0,
    nachos: 0,
    agua: 0,
    mym: 0,
    canchita_dulce: 0,
    red_bull: 0,
};

const productPrices = {
    mega_combo_diario: 15,
    mega_combo_unico: 20,
    cocacola: 5,
    canchita: 3,
    hotdog: 7,
    nachos: 6,
    agua: 2,
    mym: 4,
    canchita_dulce: 3,
    red_bull: 8,
};

function updateQuantity(productId, change) {
    const quantityElement = document.getElementById(`${productId}-quantity`);
    productQuantities[productId] += change;

    if (productQuantities[productId] < 0) {
        productQuantities[productId] = 0;
    }

    quantityElement.textContent = productQuantities[productId];
    localStorage.setItem('cart', JSON.stringify(productQuantities));

    const totalCount = Object.values(productQuantities).reduce((sum, qty) => sum + qty, 0);
    document.getElementById('cart-count').textContent = totalCount;

    updateTotalPrice(); // Actualiza el total de precios
}

function updateTotalPrice() {
    const totalPriceElement = document.getElementById('total-price');
    let totalPrice = 0;

    Object.keys(productQuantities).forEach(productId => {
        totalPrice += productQuantities[productId] * productPrices[productId];
    });

    totalPriceElement.textContent = `S/. ${totalPrice.toFixed(2)}`; // Muestra el total
}

function loadCart() {
    const cartData = JSON.parse(localStorage.getItem('cart'));
    const cartItemsContainer = document.getElementById('cart-items');

    if (cartData) {
        Object.keys(cartData).forEach(productId => {
            productQuantities[productId] = cartData[productId];
            if (productQuantities[productId] > 0) {
                const productDiv = document.createElement('div');
                productDiv.className = 'bg-white rounded-lg shadow-md p-6 text-center';
                productDiv.innerHTML = 
                    `<h3 class="text-xl font-bold">${productId.replace(/_/g, ' ')}</h3>
                    <p>Cantidad: <span id="${productId}-quantity">${productQuantities[productId]}</span></p>
                    <p>Precio: S/. ${productPrices[productId].toFixed(2)}</p>
                    <p>Subtotal: S/. ${(productQuantities[productId] * productPrices[productId]).toFixed(2)}</p>
                    <button onclick="updateQuantity('${productId}', -1)" class="bg-red-500 text-white px-2 py-1 rounded">Eliminar</button>`; //aca elimino el producto

                cartItemsContainer.appendChild(productDiv);
            }
        });
    } else {
        cartItemsContainer.innerHTML = '<p class="text-center">No hay productos en el carrito.</p>';
    }

    updateTotalPrice(); // actualizar el precio
}

// cargar los datos al inicio
window.onload = loadCart;





