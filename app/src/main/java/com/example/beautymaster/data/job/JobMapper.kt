package com.example.beautymaster.data.job

import com.example.beautymaster.data.customer.CustomerMapper
import com.example.beautymaster.domain.job.JobItem

class JobMapper {
    val customerMapper = CustomerMapper()
    fun mapJobItemToDBModel(jobItem: JobItem):JobItemDBModel{
        return JobItemDBModel(
            id = jobItem.id,
            date = jobItem.date,
            customer = customerMapper.mapCustomerToDBModel(jobItem.customer),

        )
    }
}