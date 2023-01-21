package com.example.beautymaster.domain.materialPriceRegister

import com.example.beautymaster.domain.materials.MaterialItem

data class MaterialPriceRegisterItem(
    val id : Int,
    val materialItem : MaterialItem,
    val price : Int,
    val date : String,
)
