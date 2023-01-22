package com.example.beautymaster.domain.job

import com.example.beautymaster.domain.customer.CustomerItem

data class JobItemWithCustomer(
    val jobItem:JobItem,
    val customerItem:CustomerItem,
)
