package com.example.beautymaster.domain.priceRegisterMaterial

import com.example.beautymaster.domain.jobBody.JobBodyElement

data class PriceRegisterItem(
    val id : Int,
    val material : JobBodyElement,
    val price : Int,
    val date : String,
)
