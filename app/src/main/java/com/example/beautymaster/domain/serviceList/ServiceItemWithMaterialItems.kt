package com.example.beautymaster.domain.serviceList

import com.example.beautymaster.domain.materials.MaterialItem

data class ServiceItemWithMaterialItems(
    val serviceItem : ServiceItem,
    val materialItemsList : List<MaterialItem>
)