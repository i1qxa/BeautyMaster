package com.example.beautymaster.domain.job

import kotlinx.coroutines.flow.Flow

interface JobRepository {

    suspend fun getJobListForCustomer(customerId:Int):Flow<List<JobItem>>

    suspend fun getJobListInDateRange(dateStart:String, dateEnd:String):Flow<List<JobItem>>

    suspend fun getJobItemWithCustomerAndService(jobItemId:Int):JobItemWithCustomerAndService

    suspend fun getJobItem(id:Int):JobItem

    suspend fun addJobItem(jobItem:JobItem)

    suspend fun editJobItem(jobItem:JobItem)

    suspend fun deleteJobItem(id:Int)

}