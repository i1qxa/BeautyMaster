package com.example.beautymaster.domain.priceRegisterService

import com.example.beautymaster.domain.service.ServiceItem

data class ServicePriceRegisterItem(
    val id : Int,
    val service : ServiceItem,
    val price : Int,
    val date : String,
    )