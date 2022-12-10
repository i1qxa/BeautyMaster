package com.example.beautymaster.domain.job

data class JobItem(
    val id : Int,
    val date : String,
    val customerId : Int,
    val serviceIdList : List<Int>,
){
    //Реализовать подсчет суммы заказа
}
