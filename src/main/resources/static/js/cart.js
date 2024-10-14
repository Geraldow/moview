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
}

function loadCart() {
    const cartData = JSON.parse(localStorage.getItem('cart'));
    if (cartData) {
        Object.keys(cartData).forEach(productId => {
            const quantity = cartData[productId];
            productQuantities[productId] = quantity;
            document.getElementById(`${productId}-quantity`).textContent = quantity;
        });
    }
}


