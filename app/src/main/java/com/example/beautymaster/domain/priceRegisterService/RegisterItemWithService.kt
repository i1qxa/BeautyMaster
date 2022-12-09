package com.example.beautymaster.domain.priceRegisterService

import com.example.beautymaster.domain.serviceList.ServiceItem

data class RegisterItemWithService (
    val registerItem : ServicePriceRegisterItem,
    val serviceItem : ServiceItem,
        )