package com.example.beautymaster.domain.jobBody

import com.example.beautymaster.domain.materials.MaterialItem
import com.example.beautymaster.domain.service.ServiceItem

data class JobBodyItem(
    val id:Float,
    val jobId:Int,
    val materialItem: MaterialItem?,
    val serviceItem: ServiceItem?,
    val amount:Int?,
    val price:Int,
){
    init {
        if ((materialItem == null && serviceItem == null) ||
            (materialItem != null && serviceItem != null)) throw RuntimeException(
            "only one of parameters(materialItem or serviceItem) can be null "
        )
        if (materialItem != null && amount == null) throw RuntimeException(
            "amount couldn't be absent when materialItem!=null"
        )
    }
}
