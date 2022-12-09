package com.example.beautymaster.domain.job

import com.example.beautymaster.domain.customer.CustomerItem
import com.example.beautymaster.domain.serviceList.ServiceItem

data class JobItemWithCustomerAndService(
    val job : JobItem,
    val customer : CustomerItem,
    val service : ServiceItem,
)