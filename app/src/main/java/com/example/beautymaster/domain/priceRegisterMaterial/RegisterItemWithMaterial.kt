package com.example.beautymaster.domain.priceRegisterMaterial

import com.example.beautymaster.domain.materials.MaterialItem

data class RegisterItemWithMaterial(
    val registerItem : MaterialPriceRegisterItem,
    val materialItem : MaterialItem,
)
