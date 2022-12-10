package com.example.beautymaster.domain.job

import com.example.beautymaster.domain.customer.CustomerItem
import com.example.beautymaster.domain.service.ServiceItem

data class JobItem(
    val id : Int,
    val date : String,
    val customer : CustomerItem,
    val serviceList : List<ServiceItem>,
){
    //Реализовать подсчет суммы заказа
}
