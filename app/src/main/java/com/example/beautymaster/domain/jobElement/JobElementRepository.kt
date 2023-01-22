package com.example.beautymaster.domain.jobElement

import androidx.lifecycle.LiveData

interface JobElementRepository {

    suspend fun getJobElementList(): LiveData<List<JobElementItem>>

    suspend fun getJobElementItem(id:Int): JobElementItem

    suspend fun addJobElementItem(jobElementItem: JobElementItem)

    suspend fun editJobElementItem(jobElementItem: JobElementItem)

    suspend fun deleteJobElementItem(id:Int)

}