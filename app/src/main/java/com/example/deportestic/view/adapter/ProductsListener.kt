package com.example.deportestic.view.adapter

import com.example.deportestic.model.Products

interface ProductsListener {
    fun OnProductsClick (product: Products, position: Int)
}