package com.example.beautymaster.data.job

import androidx.room.Embedded
import androidx.room.Relation
import com.example.beautymaster.data.customer.CustomerItemDBModel

data class JobItemWithCustomerDBModel(
    @Embedded
    val jobItemDBModel: JobItemDBModel,
    @Relation(
        parentColumn = "customerId",
        entityColumn = "id"
    )
    val customerItemDBModel: CustomerItemDBModel
)
