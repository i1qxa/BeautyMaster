package com.example.beautymaster.domain.serviceList

data class ServiceItem(
    val id : Int,
    val name : String,
    val listMaterialsId : List<Int>?
)