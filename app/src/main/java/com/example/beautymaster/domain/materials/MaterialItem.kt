package com.example.beautymaster.domain.materials

import com.example.beautymaster.domain.jobBody.JobBodyElement

data class MaterialItem(
    val id : Int,
    val name : String,
    val unitOM : String,
):JobBodyElement()