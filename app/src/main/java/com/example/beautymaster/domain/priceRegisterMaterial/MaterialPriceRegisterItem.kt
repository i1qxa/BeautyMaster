package com.example.beautymaster.domain.priceRegisterMaterial

import com.example.beautymaster.domain.materials.MaterialItem

data class MaterialPriceRegisterItem(
    val id : Int,
    val material : MaterialItem,
    val price : Int,
    val date : String,
)
