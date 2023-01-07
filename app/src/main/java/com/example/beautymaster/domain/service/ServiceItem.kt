package com.example.beautymaster.domain.service

import com.example.beautymaster.domain.jobBody.JobBodyElement
import com.example.beautymaster.domain.materials.MaterialItem

data class ServiceItem(
    val id : Int,
    val name : String,
    val listMaterials : List<MaterialItem>?
):JobBodyElement()