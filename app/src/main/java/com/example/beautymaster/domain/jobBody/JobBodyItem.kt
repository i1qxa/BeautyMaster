package com.example.beautymaster.domain.jobBody

data class JobBodyItem(
    val id:Float,
    val jobId:Int,
    val jobElementItemId: Int,
    val amount:Int?,
    val price:Int,
)