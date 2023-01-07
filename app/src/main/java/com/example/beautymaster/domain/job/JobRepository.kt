package com.example.beautymaster.domain.job

import androidx.lifecycle.LiveData

interface JobRepository {

    suspend fun getJobListForCustomer(customerId:Int):LiveData<List<JobItem>>

    suspend fun getJobListInDateRange(dateStart:String, dateEnd:String):LiveData<List<JobItem>>

    suspend fun getJobItem(id:Int):JobItem

    suspend fun addJobItem(jobItem:JobItem)

    suspend fun editJobItem(jobItem:JobItem)

    suspend fun deleteJobItem(id:Int)

}