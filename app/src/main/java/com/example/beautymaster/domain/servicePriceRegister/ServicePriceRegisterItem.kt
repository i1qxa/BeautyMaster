package com.example.beautymaster.domain.servicePriceRegister

import com.example.beautymaster.domain.service.ServiceItem

data class ServicePriceRegisterItem(
    val id:Float,
    val serviceItem: ServiceItem,
    val date:String,
    val price:Int,
)
