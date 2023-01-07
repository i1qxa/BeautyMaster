package com.example.beautymaster.domain.jobBody

data class JobBodyItem(
    val id:Float,
    val jobId:Int,
    val element: JobBodyElement,
    val amount:Int,
    val price:Int,
)
