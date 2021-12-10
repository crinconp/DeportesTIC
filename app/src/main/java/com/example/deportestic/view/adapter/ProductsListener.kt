package com.example.deportestic.view.adapter

import com.example.deportestic.view.ui.model.Products


interface ProductsListener {
    fun OnProductsClick (product: Products, position: Int)
}